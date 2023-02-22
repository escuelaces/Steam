package com.escuelaces.steam;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Steam {
    URL apps;

    public  Steam(){
        try {
            apps = new URL("http://api.steampowered.com/ISteamApps/GetAppList/v2");
            HttpURLConnection steamConnection = (HttpURLConnection) apps.openConnection();
            steamConnection.connect();

            if (steamConnection.getResponseCode() != 200) {
                throw new RuntimeException("HttpResponseCode: " + steamConnection.getResponseCode());
            }

            String json = "";
            Scanner scanner = new Scanner(apps.openStream());

            //Write all the JSON data into a string using a scanner
            while (scanner.hasNext()) {
                json += scanner.nextLine();
            }

            //Close the scanner
            scanner.close();

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }





}
