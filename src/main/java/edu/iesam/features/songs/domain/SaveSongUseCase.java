package edu.iesam.features.songs.domain;

import edu.iesam.features.authors.domain.Author;

public class SaveSongUseCase {

    private SongRepository repository;

    public SaveSongUseCase(SongRepository repository) {
        this.repository = repository;
    }

    public void execute(Song song) {

        repository.saveSong(song);
    }
}
