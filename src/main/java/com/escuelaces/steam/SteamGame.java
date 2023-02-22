package com.escuelaces.steam;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;

import java.util.List;

public class SteamGame {
    public SimpleStringProperty name, short_description, header_image, trailer, background, release_date, price;

    SimpleListProperty<String> platforms, genres, screenshots;

    SimpleIntegerProperty weeks ;



    public SteamGame(String name, String short_description, String header_image, String trailer, ObservableList<String> platforms, ObservableList<String> genres, ObservableList<String> screenshots, String release_date, String background, String price, int weeks ) {
        this.name = new SimpleStringProperty(name);

        this.short_description = new SimpleStringProperty(short_description);

        this.header_image = new SimpleStringProperty(header_image);
        this.trailer = new SimpleStringProperty(trailer);

        this.platforms = new SimpleListProperty<>(platforms);
        this.genres = new SimpleListProperty(genres);
        this.screenshots = new SimpleListProperty(screenshots);
        this.release_date = new SimpleStringProperty(release_date);
        this.background = new SimpleStringProperty(background);
        this.price = new SimpleStringProperty(price);
        this.weeks = new SimpleIntegerProperty(weeks);

    }
}
