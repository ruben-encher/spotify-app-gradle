package edu.iesam.features.albums.data;

import edu.iesam.features.albums.domain.Album;
import edu.iesam.features.albums.domain.AlbumRepository;

import java.util.ArrayList;
import java.util.List;

public class AlbumDataRepository implements AlbumRepository {

    private AlbumMemLocalDataSource dataSource;

    public AlbumDataRepository(AlbumMemLocalDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public ArrayList<Album> getAlbums() {
        return dataSource.getAlbums();
    }

    @Override
    public void deleteAlbum(int id) {

    }

    @Override
    public void saveAlbum(Album album) {

    }

    @Override
    public void saveAuthor(Album album) {
        dataSource.save(album);
    }
}
