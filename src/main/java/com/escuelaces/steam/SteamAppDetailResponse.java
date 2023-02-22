package com.escuelaces.steam;

public class SteamAppDetailResponse {
    boolean success;
    SteamAppDetail data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public SteamAppDetail getData() {
        return data;
    }

    public void setData(SteamAppDetail data) {
        this.data = data;
    }
}
