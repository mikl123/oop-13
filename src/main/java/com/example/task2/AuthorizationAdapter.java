package com.example.task2;

public class AuthorizationAdapter {
    private Авторизація  авторизація;
    public AuthorizationAdapter(){
        this.авторизація =  new Авторизація();
    }
    public boolean authorize(DataBaseAdapter dataBaseAdapter){
       return авторизація.авторизуватися(dataBaseAdapter.getDataBase());
    }
}
