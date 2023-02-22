package com.escuelaces.steam;

import java.util.List;

public class SteamAppDetail {
    String type,
            name;

    int steam_appid,
            required_age;

    Boolean is_free;
    String detailed_description,
            about_the_game,
            short_description,
            supported_languages,
            header_image,
            website;

    List<String> developers,
            publishers;

    SteamPlatforms platforms;
    SteamDescription categories,
            genres;

    SteamScreenshot screenshots;
    SteamReleaseDate release_date;

    String background,
            background_raw;



}
