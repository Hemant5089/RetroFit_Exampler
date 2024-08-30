package com.example.retrofitexample;

public class UserModel {
    int albunId;
    int id;
    String title;
    String url;

    String thumbnailUrl;

    public UserModel(int albunId, int id, String title, String url, String thumbnailUrl) {
        this.albunId = albunId;
        this.id = id;
        this.title = title;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
    }

    public int getAlbunId() {
        return albunId;
    }

    public void setAlbunId(int albunId) {
        this.albunId = albunId;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }
}
