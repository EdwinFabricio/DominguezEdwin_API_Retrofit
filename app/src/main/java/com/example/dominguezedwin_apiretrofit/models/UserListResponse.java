package com.example.dominguezedwin_apiretrofit.models;

import java.util.HashMap;
import java.util.Map;

public class UserListResponse {


    private String id;
    private String title;
    private String description;
    private String password;
    private String com_code;
    private String status;
    private String forgot;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCom_code() {
        return com_code;
    }

    public void setCom_code(String com_code) {
        this.com_code = com_code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getForgot() {
        return forgot;
    }

    public void setForgot(String forgot) {
        this.forgot = forgot;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
