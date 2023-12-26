package com.example.task2;

public class DataBaseAdapter {
    private БазаДаних базаДаних; 
    public DataBaseAdapter(){
         this.базаДаних = new БазаДаних();;
    }
    public String getUserData() {
        return  базаДаних.отриматиДаніКористувача();
    }

    public String getStatisticData() {
        return базаДаних.отриматиСтатистичніДані();
    }
    public БазаДаних getDataBase(){
        return  базаДаних;
    }
}
