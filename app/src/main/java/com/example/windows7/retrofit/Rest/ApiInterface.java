package com.example.windows7.retrofit.Rest;

import com.example.windows7.retrofit.Models.MovieResponse;
//Cara mendefinisikan setiap endpoint
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    //Endpoint didefinisikan dalam interface
    //menggunakan anotasi retrofit khusus untuk encode detail tentang parameter dan metode permintaan.

    @GET("movie/top_rated")
    Call<MovieResponse> getTopRatedMovies( @Query("api_key") String apiKey );

    @GET("movie/{id}")
    Call<MovieResponse> getMovieDetails( @Path("id") int id, @Query("api_key") String apiKey );

}
