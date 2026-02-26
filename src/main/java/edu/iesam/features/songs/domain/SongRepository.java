package edu.iesam.features.songs.domain;

import java.util.ArrayList;

public interface SongRepository {
    public ArrayList<Song> findAll();


    void saveSong(Song song);

    void deleteSong(int id);
}