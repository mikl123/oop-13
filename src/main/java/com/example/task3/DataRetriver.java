package com.example.task3;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import javax.sound.sampled.AudioFileFormat.Type;
import javax.swing.text.html.parser.Element;

import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class DataRetriver {
    public Company brendfetch_data(String text) throws IOException{
        OkHttpClient client = new OkHttpClient();

  Request request = new Request.Builder()
  .url("https://api.brandfetch.io/v2/brands/"+text)
  .get()
  .addHeader("accept", "application/json")
  .addHeader("Authorization", "Bearer t6QxXHKrTUQJwhG09n4lBiWGpMrEsAcj+Dqm42YrEAU=")
  .build();

Response response = client.newCall(request).execute();
JSONObject jsonObject = new JSONObject( response.body().string());
Company company = new Company(jsonObject.getString("name"),jsonObject.getString("description"),jsonObject.getJSONArray("logos").toString());
return company;
    }
    public Company jsoup_data(String search) throws IOException{
      Document doc = Jsoup.connect("https://"+search).get(); 
      Elements logos = doc.select("[src*=logo], [alt*=logo], [class*=logo], [id*=logo]");
      Elements description = doc.select("[src*=description], [alt*=description], [class*=description], [id*=description]");
      Elements name = doc.select("[src*=name], [alt*=name], [class*=name], [id*=name]");
      String company_description = "";
      String company_name = "";
      String company_logos = "";
    for (org.jsoup.nodes.Element one_logo : logos) {
       company_logos+=one_logo;
    }
    for (org.jsoup.nodes.Element one_description : description) {
        company_description +=one_description;
    }
    for (org.jsoup.nodes.Element one_name : name) {
        company_name+=one_name;
    }
      Company company = new Company(company_name, company_description, company_logos);
      return company;
    }
}
