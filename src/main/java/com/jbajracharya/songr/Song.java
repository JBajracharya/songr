package com.jbajracharya.songr;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne
    Album album;

    public String songTitle;
    public int length;
    public int trackNumber;

    public Song() {

    }

    public Song(String songTitle, int length, int trackNumber, Album album) {
        this.album = album;
        this.songTitle = songTitle;
        this.length = length;
        this.trackNumber = trackNumber;
    }

    public String toString() {
        return String.format("Title: %s Track number: %d Length: %d",
                songTitle, length, trackNumber);
    }
}
