package edu.iesam;

import edu.iesam.features.albums.domain.Album;
import edu.iesam.features.albums.presentation.AlbumView;
import edu.iesam.features.authors.presentation.AuthorView;

public class Main {
    public static void main(String[] args) {
        //SongView.printSongs();
        //AuthorView.printAuthors();

        AlbumView.printAlbums();
        AlbumView.saveAlbums(new Album(1,"Rubén", 2000));
        AuthorView.printAuthors();
    }
}