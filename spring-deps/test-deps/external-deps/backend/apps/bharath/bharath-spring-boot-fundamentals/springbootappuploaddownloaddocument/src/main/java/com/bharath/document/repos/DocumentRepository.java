package com.bharath.document.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.document.entities.Document;

public interface DocumentRepository extends JpaRepository<Document, Long> {

}
