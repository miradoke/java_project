package com.packageDemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class Playlist {
	
	
    private Deque<String> songs;
    private int capacity;

    public Playlist(int capacity) {
        this.songs = new ArrayDeque<>();
        this.capacity = capacity;
    }

    public void playSong(String song) {
        // If playlist is full, remove the oldest song
        if (songs.size() == capacity) {
            songs.removeFirst();
        }
        // Add the new song to the end of the playlist
        songs.addLast(song);
    }

    public void printPlaylist() {
        System.out.println("Current Playlist: " + songs);
    }


	public static void main(String[] args) {
		Playlist playlist = new Playlist(3);
        playlist.playSong("S1");
        playlist.playSong("S2");
        playlist.playSong("S3");
        playlist.printPlaylist(); // Output: Current Playlist: [S1, S2, S3]
        
        playlist.playSong("S4");
        playlist.printPlaylist(); // Output: Current Playlist: [S2, S3, S4]
        
        playlist.playSong("S2");
        playlist.printPlaylist(); // Output: Current Playlist: [S3, S4, S2]
        
        playlist.playSong("S1");
        playlist.printPlaylist(); // Output: Current Playlist: [S4, S2, S1]
    }

	}


