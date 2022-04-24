package com.example.tp4.Post;

import com.google.gson.annotations.SerializedName;

public class Post {

    private int userId ;
    private int id ;
    private String title ;
    @SerializedName("body")
    private String text ;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}



