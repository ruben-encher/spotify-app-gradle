package edu.iesam.features.albums.presentation;

import edu.iesam.features.albums.data.AlbumDataRepository;
import edu.iesam.features.albums.data.AlbumMemLocalDataSource;
import edu.iesam.features.albums.domain.*;
import edu.iesam.features.authors.domain.GetAuthorsUseCase;

import java.util.ArrayList;

public class AlbumView {

    public static void printAlbums() {
        GetAlbumsUseCase getAlbumsUseCase = new GetAlbumsUseCase(new AlbumDataRepository(AlbumMemLocalDataSource.newInstance()));

        ArrayList<Album> albums = getAlbumsUseCase.execute();
        System.out.println(albums);
    }

    public static void saveAlbums(Album album) {
        SaveAlbumUseCase saveAlbumUseCase = new SaveAlbumUseCase(new AlbumDataRepository(AlbumMemLocalDataSource.newInstance()));


        saveAlbumUseCase.execute(album);
    }

    public static void deleteAlbums(int id) {
            DeleteAlbumUseCase deleteAlbumUseCase = new DeleteAlbumUseCase(new AlbumDataRepository(AlbumMemLocalDataSource.newInstance()));

        deleteAlbumUseCase.execute(id);
    }
}
