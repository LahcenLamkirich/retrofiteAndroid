package com.example.tp4.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface JsonApi {
    @GET("posts")
    Call<List<Post>> getPosts();
}
