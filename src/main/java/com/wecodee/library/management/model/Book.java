package com.wecodee.library.management.model;

import jakarta.persistence.*;
import jdk.jfr.Category;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "books")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long bookId;

    @Column(nullable = false)
    private String bookname;

    @Column(nullable = false)
    private  String author;

    private String Category;
    private boolean isBorrowed;
    private  boolean isReturned;

}
