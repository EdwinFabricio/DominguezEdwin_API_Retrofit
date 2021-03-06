package com.example.dominguezedwin_apiretrofit.models;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.dominguezedwin_apiretrofit.R;

import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.UsersViewHolder> {

    Context context;
    List<UserListResponse> userListResponseData;

    public UsersAdapter(Context context, List<UserListResponse> userListResponseData) {
        this.userListResponseData = userListResponseData;
        this.context = context;
    }

    @Override
    public UsersViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.user_list_items, null);
        UsersViewHolder usersViewHolder = new UsersViewHolder(view);
        return usersViewHolder;
    }

    @Override
    public void onBindViewHolder(UsersViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        // set the data
        holder.name.setText("Nombre: " + userListResponseData.get(position).getTitle());
        holder.email.setText("Decripcion del producto: " + userListResponseData.get(position).getDescription());

        // implement setONCLickListtener on itemView
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // display a toast with user name
                Toast.makeText(context, userListResponseData.get(position).getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return userListResponseData.size(); // size of the list items
    }

    class UsersViewHolder extends RecyclerView.ViewHolder {
        // init the item view's
        TextView name, email;


        public UsersViewHolder(View itemView) {
            super(itemView);
            // get the reference of item view's
            name = (TextView) itemView.findViewById(R.id.nombre);
            email = (TextView) itemView.findViewById(R.id.descripcion);


        }
    }
}
