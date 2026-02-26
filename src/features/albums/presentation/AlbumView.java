package features.albums.presentation;

import features.albums.data.AlbumDataRepository;
import features.albums.data.AlbumMemLocalDataSource;
import features.albums.domain.Album;
import features.albums.domain.GetAlbumsUseCase;
import features.albums.domain.SaveAlbumUseCase;

import java.util.ArrayList;

public class AlbumView {


    public static void printAlbums(){
        GetAlbumsUseCase getAlbumsUseCase = new GetAlbumsUseCase(
                new AlbumDataRepository(AlbumMemLocalDataSource.newInstance())
        );
        ArrayList<Album> albums = getAlbumsUseCase.execute();
        System.out.println(albums);
    }

    public static void saveAlbum(){
        Album newAlbum = new Album("2" , "name2", "2000");
        SaveAlbumUseCase saveAlbumUseCase = new SaveAlbumUseCase(
                new AlbumDataRepository(AlbumMemLocalDataSource.newInstance())
        );
        saveAlbumUseCase.execute(newAlbum);


        printAlbums();
    }

}
