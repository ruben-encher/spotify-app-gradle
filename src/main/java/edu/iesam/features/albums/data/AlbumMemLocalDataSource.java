package edu.iesam.features.albums.data;

import edu.iesam.features.albums.domain.Album;

import java.util.ArrayList;
import java.util.List;

public class AlbumMemLocalDataSource {

    private static AlbumMemLocalDataSource instance = null;

    private ArrayList<Album> albums = new ArrayList<>();

    public AlbumMemLocalDataSource() {
        albums.add(new Album(1, "Thriller", 1982));
        albums.add(new Album(2, "Back in Black", 1980));
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void save(Album album) {
    }

    public static AlbumMemLocalDataSource newInstance() {
        if (instance == null) {
            instance = new AlbumMemLocalDataSource();
        }
        return instance;
    }
}
