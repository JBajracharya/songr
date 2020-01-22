package com.jbajracharya.songr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlbumTest {
    Album album = new Album("Sunshine", "John Lennon", 10, 3000, "www.blahblah.com");
    @Test
    public void testAlbumConstructor() {
        assertEquals("Sunshine", album.getTitle());
        assertTrue(album.getArtist().startsWith("J"));
        assertEquals(10, album.getSongCount());
    }

    @Test
    public void testgetters() {
        assertNotNull(album.getImageUrl());
        assertEquals(3000, album.getSeconds());
    }

    @Test
    public void testSetters() {
        album.setTitle("Journey");
        album.setArtist("Brian Adams");
        album.setSongCount(30);
        album.setSeconds(2000);
        album.setImageUrl("www.zzzzzzz.com");

        assertEquals("Journey", album.getTitle());
        assertEquals("Brian Adams", album.getArtist());
        assertEquals(30, album.getSongCount());
        assertEquals(2000, album.getSeconds());
        assertEquals("www.zzzzzzz.com", album.getImageUrl());
    }
}