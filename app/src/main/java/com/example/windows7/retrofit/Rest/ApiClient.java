package com.example.windows7.retrofit.Rest;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    //Untuk mengirim permintaan jaringan ke API,
    public static final String BASE_URL = "http://api.themoviedb.org/3/";

    private static Retrofit retrofit = null;

    public static Retrofit getClient(){

        if(retrofit==null){
            //Untuk mengirim permintaan jaringan ke API,
            // kita perlu menggunakan kelas builder Retrofit dan menentukan URL dasar untuk layanan tersebut.
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return  retrofit;
    }

}

