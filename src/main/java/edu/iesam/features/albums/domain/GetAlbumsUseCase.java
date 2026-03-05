package edu.iesam.features.albums.domain;

import java.util.ArrayList;
import java.util.List;

public class GetAlbumsUseCase {

    private  AlbumRepository repository;

    public GetAlbumsUseCase(AlbumRepository repository) {
        this.repository = repository;
    }

    public ArrayList<Album> execute() {
        return repository.getAlbums();
    }
}