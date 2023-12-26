package com.example;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.example.task3.DataRetriver;

public class Main {
    public static void main(String[] args) throws IOException {
        
        DataRetriver dataRetriver = new DataRetriver();
        
        System.out.println(dataRetriver.jsoup_data("Apple.com"));  
    }
}