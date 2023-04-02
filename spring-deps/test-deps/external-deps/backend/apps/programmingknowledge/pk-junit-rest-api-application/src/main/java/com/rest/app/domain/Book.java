package com.rest.app.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "book_record")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;
    @NonNull
    private String name;
    @NonNull
    private String summary;
    private int rating;
}
