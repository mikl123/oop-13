package com.example.task1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TwitterUser {
    private String email;
    private int active_time;
    private String country;
    public String getUserMail(){
        return email;
    }
    public String getCountry(){
        return country;
    }
    public int getLastActiveTime(){
        return active_time;
    }
}
