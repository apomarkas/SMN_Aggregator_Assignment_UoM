package com.example.smn_aggregator_assignment;

import android.media.Image;

public class Post {

    private String postText;
    private String url;
    private Image image;
    private int identifier;

    public Post (String text,String url){
        this.postText = text;
        this.url = url;

    }

    public String getPostText() {
        return postText;
    }


    public String getUrl() {
        return url;
    }


    public Image getImage() {
        return image;
    }


    public int getIdentifier() {
        return identifier;
    }


}
