package edu.iesam.features.albums.domain;

public class DeleteAlbumUseCase {

        private AlbumRepository repository;

        public void DeleteAuthorUseCase(AlbumRepository repository) {
            this.repository = repository;
        }

        public void execute(int id) {
            repository.deleteAlbum(id);
        }
}
