package com.escuelaces.steam;

public class SteamReleaseDate {
    boolean coming_soon;
    String date;

    public boolean isComing_soon() {
        return coming_soon;
    }

    public void setComing_soon(boolean coming_soon) {
        this.coming_soon = coming_soon;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
