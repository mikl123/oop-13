package com.example.task1;

import java.util.ArrayList;

public class MessageSender {
    ArrayList<User> users;
    public MessageSender(){
        users = new ArrayList<>();
    }
    public void add_user(User user){
        users.add(user);
    }
    public String send(String text, User user,String country){
        for( int i = 0; i< users.size();i++){
            if (users.get(i) == user){
                if (user.getCountry() == country && user.getActiveTime() == 1){
                    return "Sent succesfully to "+ user.getEmail();
                }else{
                    return "Country or activity time error";
                }
            }
        }
        return "No such user";
    }
}
