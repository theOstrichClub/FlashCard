package com.bizmedia.shokitakeda.flashcard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Phlight on 07.06.2018.
 */
public class Profile {

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("read")
    @Expose
    private String read;

    @SerializedName("mean")
    @Expose
    private String mean;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRead() {
        return read;
    }

    public void setRead(String read) {
        this.read = read;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }
}