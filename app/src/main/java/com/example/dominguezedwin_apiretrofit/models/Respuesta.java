package com.example.dominguezedwin_apiretrofit.models;

import com.example.dominguezedwin_apiretrofit.API.Api_service;

import java.util.ArrayList;
import retrofit2.*;
import retrofit2.converter.gson.GsonConverterFactory;


public class Respuesta {

    private static Retrofit retrofit = null;
    public static Api_service getClient() {

        // change your base URL
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://mobileappdatabase.in/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        //Creating object for our interface
        Api_service api = retrofit.create(Api_service.class);
        return api;
    }
}
