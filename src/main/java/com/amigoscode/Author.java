package com.amigoscode;

import java.util.List;

public record Author(Integer id, String name) {
    public static List<Author> authors() {
        return List.of(
                new Author(1, "Jk Rowling"),
                new Author(2, "Kafka"),
                new Author(3, "Tolkien")
        );
    }

    public static Author getAuthorById(Integer id) {
        return authors().stream()
                .filter(author -> author.id().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Author not found"));
    }
}
