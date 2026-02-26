package edu.iesam.features.authors.data;

import edu.iesam.features.authors.domain.Author;

import java.util.ArrayList;
import java.util.List;

public class AuthorMemLocalDataSource {

    public List<Author> authors = new ArrayList<>();

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public List<Author> getAuthors() {
        return authors;
    }
}
