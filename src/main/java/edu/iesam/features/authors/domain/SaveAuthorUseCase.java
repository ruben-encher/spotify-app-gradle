package edu.iesam.features.authors.domain;

public class SaveAuthorUseCase {

    private AuthorRepository repository;

    public SaveAuthorUseCase(AuthorRepository repository) {
        this.repository = repository;
    }

    public void execute(Author author) {
        repository.saveAuthor(author);
    }
}
