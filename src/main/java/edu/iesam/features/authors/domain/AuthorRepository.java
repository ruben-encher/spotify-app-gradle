package edu.iesam.features.authors.domain;

import edu.iesam.features.albums.domain.Album;

import java.util.ArrayList;

public interface AuthorRepository {

    ArrayList<Author> getAuthors();

    void saveAuthor(Author author);

    void deleteAuthor(int id);
}