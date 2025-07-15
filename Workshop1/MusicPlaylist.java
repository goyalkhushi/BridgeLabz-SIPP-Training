package workshop;

import java.util.*;

abstract class MediaPlayer {
    abstract void addSong(String song);
    abstract void playNext();
    abstract String getCurrentSong();
}


class MusicPlayer extends MediaPlayer {
    private Queue<String> playlist = new LinkedList<>();
    private String currentSong = null;

    @Override
    public void addSong(String song) {
        playlist.offer(song);
        System.out.println("Added to playlist: " + song);
    }

    @Override
    public void playNext() {
        if (!playlist.isEmpty()) {
            currentSong = playlist.poll();
            System.out.println("Now playing: " + currentSong);
        } 
        else {
            currentSong = null;
            System.out.println("Playlist is empty.");
        }
    }

    @Override
    public String getCurrentSong() {
        return (currentSong != null) ? currentSong : "No song is playing.";
    }

    
    public void removeSong(String song) {
        if (playlist.remove(song)) {
            System.out.println("Removed from playlist: " + song);
        }
        else {  
        	System.out.println("Song not found in playlist.");
        }
    }

    
    public void showPlaylist() {
        System.out.println("Upcoming songs: " + playlist);
    }
}

public class MusicPlaylist{
	public static void main(String[] args) {
        MediaPlayer player = new MusicPlayer(); 

        player.addSong("Sapphire");
        player.addSong("Perfect");
        player.addSong("Who Says");

        System.out.println("Current: " + player.getCurrentSong()); 

        System.out.println();
        
        player.playNext(); // Let Her Go
        System.out.println("Current: " + player.getCurrentSong());

        player.playNext(); // Perfect
        player.playNext(); // Who Says
        player.playNext(); // Playlist is empty
    }
}
