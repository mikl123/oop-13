package com.example.task1;
public class TwitterUserAdapter implements User {

    TwitterUser twitterUser;
    public TwitterUserAdapter(TwitterUser twitterUser){
        this.twitterUser = twitterUser;
    }
    @Override
    public int getActiveTime() {
        
        return  twitterUser.getLastActiveTime();
    }
    @Override
    public String getCountry() {
        // TODO Auto-generated method stub
        return twitterUser.getCountry();
    }
    @Override
    public String getEmail() {
        // TODO Auto-generated method stub
        return twitterUser.getUserMail();
    }
}
