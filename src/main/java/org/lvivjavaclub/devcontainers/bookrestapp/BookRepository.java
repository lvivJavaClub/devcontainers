package org.lvivjavaclub.devcontainers.bookrestapp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}