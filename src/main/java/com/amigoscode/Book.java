package com.amigoscode;

import java.util.List;

public record Book(
        Integer id,
        String name,
        Integer pageCount,
        Integer authorId
) {
    public static List<Book> books() {
        return List.of(
                new Book(1, "Harry Potter and the Philosopher's Stone", 223, 1),
                new Book(2, "The Great Gatsby", 200,2),
                new Book(3, "Foo", 132,3)
        );

    }

    public static Book getBookById(Integer id) {
        return books().stream()
                .filter(book -> book.id().equals(id))
                .findFirst()
                .orElse(null);
    }
}
