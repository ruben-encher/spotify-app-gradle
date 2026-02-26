package features.songs.data;



import features.songs.domain.Song;
import features.songs.domain.SongRepository;

import java.util.ArrayList;

public class SongBdDataRepository implements SongRepository {
    @Override
    public ArrayList<Song> findAll() {
        Song song1 = new Song();
        song1.setId("1");
        song1.setTitle("Macarena");
        song1.setAuthor("Los del Rio");
        song1.setDuration("4:00:00");



        ArrayList<Song> songs = new ArrayList<>();
        songs.add(song1);


        return songs;
    }

}
