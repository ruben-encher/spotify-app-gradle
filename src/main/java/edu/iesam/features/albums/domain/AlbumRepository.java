package edu.iesam.features.albums.domain;

import java.util.List;

public interface AlbumRepository {
    List<Album> getAlbums();

    void deleteAlbum(int id);
}
