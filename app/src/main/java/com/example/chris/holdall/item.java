package com.example.chris.holdall;

/**
 * Created by Chris on 22/11/2016.
 */

public class item {
    private String url;
    private String title;

    public item(String title,String url) {
        this.url = url;
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
