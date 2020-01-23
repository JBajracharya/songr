package com.jbajracharya.songr;

import javax.persistence.*;
import java.util.List;

//make a table for the class
@Entity
public class Album {
    // id is primary key
    // generated value makes it start at one and increment

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @OneToMany(mappedBy = "album")
    public List<Song> songs;


    private String title;
    private String artist;
    private int songCount;
    private int length;
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

    public int getLength() {
        return length;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Album(String title, String artist, int songCount, int seconds, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = seconds;
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

    public void setLength(int seconds) {
        this.length = seconds;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
