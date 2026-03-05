package edu.iesam.features.albums.domain;

import java.util.ArrayList;
import java.util.List;

public interface AlbumRepository {
    ArrayList<Album> getAlbums();

    void deleteAlbum(int id);

    void saveAlbum(Album album);

    void saveAuthor(Album album);
}
