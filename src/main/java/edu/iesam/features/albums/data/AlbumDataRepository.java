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
    public List<Album> getAlbums() {
        return dataSource.getAlbums();
    }
}
