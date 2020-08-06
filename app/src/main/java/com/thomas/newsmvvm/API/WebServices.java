package com.thomas.newsmvvm.API;

import com.thomas.newsmvvm.API.Model.NewsResponse;
import com.thomas.newsmvvm.API.Model.SourcesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface WebServices {

    @GET("sources")
   Call<SourcesResponse>  getNewsSources(@Query("apiKey") String apikey,
                                         @Query("language") String language);

    @GET("everything")
    Call<NewsResponse> getNews(@Query("apiKey") String apikey,
                               @Query("language") String language,
                               @Query("sources") String sources);
}
