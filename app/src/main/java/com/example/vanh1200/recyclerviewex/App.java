package com.example.vanh1200.recyclerviewex;

import java.io.Serializable;

public class App implements Serializable {
    private String mTitle;
    private String mImage;
    private String mDescription;

    public App(String mTitle, String mImage, String mDescription) {
        this.mTitle = mTitle;
        this.mImage = mImage;
        this.mDescription = mDescription;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getImage() {
        return mImage;
    }

    public void setImage(String image) {
        mImage = image;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
