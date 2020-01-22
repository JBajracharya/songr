package com.jbajracharya.songr;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

//make a table for the class
@Entity
public class Album {
    // id is primary key
    // generated value makes it start at one and increment

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    private String title;
    private String artist;
    private int songCount;
    private int seconds;
    private String imageUrl;



    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public int getSeconds() {
        return seconds;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Album(String title, String artist, int songCount, int seconds, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.seconds = seconds;
        this.imageUrl = imageUrl;
    }

    public Album() {

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
