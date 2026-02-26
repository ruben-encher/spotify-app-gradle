package edu.iesam.features.songs.domain;

public class DeleteSongUseCase {

    private SongRepository repository;

    public DeleteSongUseCase(SongRepository repository) {
        this.repository = repository;
    }

    public void execute(int id) {
        repository.deleteSong(id);
    }
}
