package com.example.tp4.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("api/users")
    Call<List<User>> getusers();
}
