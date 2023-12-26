package com.example.task1;
public class FacebookUserAdapter implements User {
    FacebookUser facebookUser;
    public FacebookUserAdapter(FacebookUser facebookUser){
        this.facebookUser = facebookUser;
    }
    @Override
    public int getActiveTime() {
        return  facebookUser.getUserActiveTime();
    }
    @Override
    public String getCountry() {
        return facebookUser.getUserCountry();
    }
    @Override
    public String getEmail() {
        return facebookUser.getEmail();
    }
}
