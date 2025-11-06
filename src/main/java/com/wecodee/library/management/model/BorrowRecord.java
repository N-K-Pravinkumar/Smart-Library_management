package com.wecodee.library.management.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Getter
@Setter
@AllArgsConstructor
public class BorrowRecord {
    private long studentId;
    private long bookId;
    private LocalDate borrowDate;
    private LocalDate returnDate;
    private double fine;

}
