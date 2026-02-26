package edu.iesam.features.albums.domain;

import java.util.List;

public class GetAlbumsUseCase {

    private AlbumRepository repository;

    public GetAlbumsUseCase(AlbumRepository repository) {
        this.repository = repository;
    }

    public List<Album> execute() {
        return repository.getAlbums();
    }
}