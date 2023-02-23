package com.escuelaces.steam;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Steam {
    URL appsEndpoint;

    public  Steam(){
        try {
            appsEndpoint = new URL("http://api.steampowered.com/ISteamApps/GetAppList/v2");

            var appdetailsEP = new URL("https://store.steampowered.com/api/appdetails?appids=");

            ObjectMapper mapper = new ObjectMapper();

            var apps = mapper.readValue(appsEndpoint, SteamApps.class);



            HttpURLConnection steamConnection = (HttpURLConnection) appsEndpoint.openConnection();
            steamConnection.connect();

            if (steamConnection.getResponseCode() != 200) {
                throw new RuntimeException("HttpResponseCode: " + steamConnection.getResponseCode());
            }

            String json = "";
            Scanner scanner = new Scanner(appsEndpoint.openStream());

            //Write all the JSON data into a string using a scanner
            while (scanner.hasNext()) {
                json += scanner.nextLine();
            }

            //Close the scanner
            scanner.close();

            //Get apps details


        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }





}
