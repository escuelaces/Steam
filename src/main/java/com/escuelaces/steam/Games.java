package com.escuelaces.steam;

import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;




public class Games {

    public static Games instance = new Games();

    public SimpleStringProperty windowsLogo = new SimpleStringProperty("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/Windows_logo_-_2012.svg/1024px-Windows_logo_-_2012.svg.png");
    public SimpleStringProperty macLogo = new SimpleStringProperty("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/Icon-Mac.svg/2048px-Icon-Mac.svg.png");
    public SimpleStringProperty linuxLogo = new SimpleStringProperty("https://upload.wikimedia.org/wikipedia/commons/thumb/d/dd/Linux_logo.jpg/640px-Linux_logo.jpg");

    public SimpleListProperty<SteamGame> list = new SimpleListProperty<>(
            FXCollections.observableArrayList(
                    new SteamGame("Hogwarts Legacy",
                            "Hogwarts Legacy is an immersive, open-world action RPG. Now you can take control of the action and be at the center of your own adventure in the wizarding world.",
                            "https://cdn.cloudflare.steamstatic.com/steam/apps/990080/header.jpg?t=1676412613",
                            "hogwarts-legacy-official-launch-trailer.mp4",
                            FXCollections.observableArrayList("Windows"),
                            FXCollections.observableArrayList("Action", "Adventure", "RPG"),
                            FXCollections.observableArrayList("https://cdn.cloudflare.steamstatic.com/steam/apps/256930504/movie.184x123.jpg?t=1676412591",
                                    "https://cdn.cloudflare.steamstatic.com/steam/apps/990080/ss_725bf58485beb4aa37a3a69c1e2baa69bf3e4653.116x65.jpg?t=1676412613",
                                    "https://cdn.cloudflare.steamstatic.com/steam/apps/990080/ss_df93b5e8a183f7232d68be94ae78920a90de1443.116x65.jpg?t=1676412613",
                                    "https://cdn.cloudflare.steamstatic.com/steam/apps/990080/ss_94058497bf0f8fabdde17ee8d59bece609a60663.116x65.jpg?t=1676412613",
                                    "https://cdn.cloudflare.steamstatic.com/steam/apps/990080/ss_8e08976236d29b1897769257ac3c64e9264792a5.116x65.jpg?t=1676412613"),
                            "10 Feb, 2023",
                            "https://cdn.akamai.steamstatic.com/steam/apps/1880830/page_bg_generated_v6b.jpg?t=1676058048",
                            "59.99$",
                            50
                    ),

                    new SteamGame("Counter-Strike",
                            "Counter-Strike: Global Offensive (CS: GO) expands upon the team-based action gameplay that it pioneered when it was launched 19 years ago. CS: GO features new maps, characters, weapons, and game modes, and delivers updated versions of the classic CS content (de_dust2, etc.).",
                            "https://cdn.cloudflare.steamstatic.com/steam/apps/730/header.jpg?t=1668125812",
                            "counter-strike-global-offensive-trailer.mp4",
                            FXCollections.observableArrayList("Windows", "Mac"),
                            FXCollections.observableArrayList("Action", "Adventure", "Free to Play"),
                            FXCollections.observableArrayList("https://cdn.cloudflare.steamstatic.com/steam/apps/256785837/movie.184x123.jpg?t=1589836574",
                                    "https://cdn.cloudflare.steamstatic.com/steam/apps/256672764/movie.184x123.jpg?t=1476830888",
                                    "https://cdn.cloudflare.steamstatic.com/steam/apps/256672764/movie.184x123.jpg?t=1476830888",
                                    "https://cdn.cloudflare.steamstatic.com/steam/apps/256658329/movie.184x123.jpg?t=1470330665"),
                            "6 Nov, 2015",
                            "https://cdn.akamai.steamstatic.com/steam/apps/683100/page.bg.jpg?t=1646764759",
                            "Free",
                            550
                    ),


                    new SteamGame("Apex Legends™",
                            "Apex Legends is the award-winning, free-to-play Hero Shooter from Respawn Entertainment. Master an ever-growing roster of legendary characters with powerful abilities, and experience strategic squad play and innovative gameplay in the next evolution of Hero Shooter and Battle Royale.",
                            "https://cdn.cloudflare.steamstatic.com/steam/apps/1172470/header.jpg?t=1676397745",
                            "apex-legends-revelry-launch-trailer-y2bs.mp4",
                            FXCollections.observableArrayList("Windows"),
                            FXCollections.observableArrayList("Action", "Free to Play"),
                            FXCollections.observableArrayList("https://cdn.cloudflare.steamstatic.com/steam/apps/1172470/ss_5c150b9e86863e73fa4924657f6109db0e3b46a1.116x65.jpg?t=1676397745",
                                    "https://cdn.cloudflare.steamstatic.com/steam/apps/1172470/ss_e5bc45b4296b02ce652868bae776d108a4db617e.116x65.jpg?t=1676397745",
                                    "https://cdn.cloudflare.steamstatic.com/steam/apps/1172470/ss_670b9be3a47d8630b42189a8e39c345bd3b9940b.116x65.jpg?t=1676397745",
                                    "https://cdn.cloudflare.steamstatic.com/steam/apps/1172470/ss_e658fec4d9f28bf4a133618d537d42a0e831b335.116x65.jpg?t=1676397745"),
                            "5 Nov, 2020",
                            "https://cdn.akamai.steamstatic.com/steam/apps/1440360/page_bg_generated_v6b.jpg?t=1675437161",
                            "Free",
                            120

                    ),

                    new SteamGame("WILD HEARTS™",
                            "Master ancient tech to hunt down giant beasts.",
                            "https://cdn.cloudflare.steamstatic.com/steam/apps/1938010/header.jpg?t=1676571541",
                            "wild-hearts-official-story-trailer-welcome-to-minato-y2bs.com.mp4",
                            FXCollections.observableArrayList("Windows"),
                            FXCollections.observableArrayList("Action", "Adventure"),
                            FXCollections.observableArrayList("https://cdn.cloudflare.steamstatic.com/steam/apps/1938010/ss_4233515fd9b5df6ae550989f134b09f813ad4f7e.600x338.jpg?t=1676571541",
                                    "https://cdn.cloudflare.steamstatic.com/steam/apps/1938010/ss_ccb28e904440ccd78677cc9d9799f1c7d72fe7f5.600x338.jpg?t=1676571541",
                                    "https://cdn.cloudflare.steamstatic.com/steam/apps/1938010/ss_aa243a5f3a9622fdfb1c57ff7dcb66810ee58077.600x338.jpg?t=1676571541",
                                    "https://cdn.cloudflare.steamstatic.com/steam/apps/1938010/ss_7ec36c7ca779fd8b3918e402ffd5cf554bb2d1e6.600x338.jpg?t=1676571541"),
                            "16 Feb, 2023",
                            "https://cdn.cloudflare.steamstatic.com/steam/apps/1938010/capsule_616x353.jpg?t=1676305498",
                            "59.99$",
                            63
                    ),

                    new SteamGame("Snake™",
                            "Snake vs Snake is a fast paced snake game with an insane battle mode with power-ups and much more. Inspired by old classical Snake but with a much faster arcade pace and local multiplayer support.",
                            "https://cdn.cloudflare.steamstatic.com/steam/apps/1005310/header.jpg?t=1667986940",
                            "snake-vs-snake-fast-paced-snake-with-battle-mode.mp4",
                            FXCollections.observableArrayList("Windows", "Mac", "Linux"),
                            FXCollections.observableArrayList("Action", "Casual", "Indie"),
                            FXCollections.observableArrayList("https://cdn.cloudflare.steamstatic.com/steam/apps/1005310/ss_95a4697e4ba23d31a9080f15399a4c90f81fda2d.1920x1080.jpg?t=1667986940",
                                    "https://cdn.cloudflare.steamstatic.com/steam/apps/1005310/ss_f0481ef5cb8c6aa1d14c487037c431b29ae09526.1920x1080.jpg?t=1667986940",
                                    "https://cdn.cloudflare.steamstatic.com/steam/apps/1005310/ss_a6b7e146e2cbeb02bfe6b6c303b54e6a8d6c66fb.1920x1080.jpg?t=1667986940",
                                    "https://cdn.cloudflare.steamstatic.com/steam/apps/1005310/ss_95a4697e4ba23d31a9080f15399a4c90f81fda2d.1920x1080.jpg?t=1667986940"),
                            "16 Feb, 2023",
                            "https://cdn.akamai.steamstatic.com/steam/apps/1005310/capsule_616x353.jpg?t=1649163693",
                            "Free$",
                            2
                    ),

                    new SteamGame("Team Fortress 2™",
                            "Nine distinct classes provide a broad range of tactical abilities and personalities. Constantly updated with new game modes, maps, equipment and, most importantly, hats!",
                            "https://cdn.cloudflare.steamstatic.com/steam/apps/440/header.jpg?t=1665425286",
                            "team-fortress-2-trailer-y2bs.com.mp4",
                            FXCollections.observableArrayList("Windows", "Mac", "Linux"),
                            FXCollections.observableArrayList("Action", "Free to Play"),
                            FXCollections.observableArrayList("https://cdn.cloudflare.steamstatic.com/steam/apps/440/0000002576.1920x1080.jpg?t=1665425286",
                                    "https://cdn.cloudflare.steamstatic.com/steam/apps/440/ss_ea21f7bbf4f79bada4554df5108d04b6889d3453.1920x1080.jpg?t=1665425286",
                                    "https://cdn.cloudflare.steamstatic.com/steam/apps/440/0000002574.1920x1080.jpg?t=1665425286",
                                    "https://cdn.cloudflare.steamstatic.com/steam/apps/440/ss_e79f2490af3247b4b0f8d412d437b72c321cfe3b.1920x1080.jpg?t=1665425286"),
                            "10 Oct, 2007",
                            "https://cdn.akamai.steamstatic.com/steam/apps/440/capsule_616x353.jpg?t=1665425286",
                            "Free$",
                            250
                    )


            )

    );
}


