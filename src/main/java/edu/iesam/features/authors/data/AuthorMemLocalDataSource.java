package edu.iesam.features.authors.data;

import edu.iesam.features.authors.domain.Author;

import java.util.ArrayList;
import java.util.List;

public class AuthorMemLocalDataSource {

    private List<Author> authors = new ArrayList<>();

    public void save(Author author) {
        authors.add(author);
    }

    public List<Author> getAuthors() {
        return authors;
    }
}
