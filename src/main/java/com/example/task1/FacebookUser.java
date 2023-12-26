package com.example.task1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FacebookUser {
    private String email;
    private int active_time;
    private String country;
    public String getEmail(){
        return email;
    }
    public String getUserCountry(){
        return country;
    }
    public int getUserActiveTime(){
        return active_time;
    }
}
