package edu.iesam.features.authors.data;

import edu.iesam.features.authors.domain.Author;
import edu.iesam.features.authors.domain.AuthorRepository;

public class AuthorDataRepository implements AuthorRepository {

    private AuthorMemLocalDataSource dataSource;

    public AuthorDataRepository(AuthorMemLocalDataSource dataSource, AuthorApiLocalDataSource authorApiLocalDataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void saveAuthor(Author author) {
        dataSource.save(author);
    }

    @Override
    public void deleteAuthor(int id) {

    }
}
