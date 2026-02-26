package edu.iesam.features.authors.domain;

public class DeleteAuthorUseCase {

    private AuthorRepository repository;

    public DeleteAuthorUseCase(AuthorRepository repository) {
        this.repository = repository;
    }

    public void execute(int id) {
        repository.deleteAuthor(id);
    }
}
