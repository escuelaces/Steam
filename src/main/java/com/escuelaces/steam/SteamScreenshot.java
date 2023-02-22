package com.escuelaces.steam;

public class SteamScreenshot {
    int id;
    String path_thumbnail,
            path_full;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPath_thumbnail() {
        return path_thumbnail;
    }

    public void setPath_thumbnail(String path_thumbnail) {
        this.path_thumbnail = path_thumbnail;
    }

    public String getPath_full() {
        return path_full;
    }

    public void setPath_full(String path_full) {
        this.path_full = path_full;
    }
}
