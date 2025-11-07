package com.wecodee.library.management.controller;

import com.wecodee.library.management.dto.BookDto;
import com.wecodee.library.management.model.BorrowRecord;
import com.wecodee.library.management.model.User;
import com.wecodee.library.management.service.LibrarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/librarian")
public class LibrarianController {

    @Autowired
    private LibrarianService librarianService;

    @GetMapping("/home")
    public Map<String, Object> home() {
        return librarianService.getDashboardSummary();
    }

    @GetMapping("/students")
    public List<User> getAllStudents(@RequestParam(required = false) String sortBy) {
        return librarianService.getAllStudentsSorted(sortBy);
    }

    @GetMapping("/books")
    public List<BookDto> getBooks(
            @RequestParam(required = false) Long bookId,
            @RequestParam(required = false) String bookName,
            @RequestParam(required = false) String author,
            @RequestParam(required = false) Boolean borrowed
    ) {
        return librarianService.getBooks(bookId, bookName, author, borrowed);
    }

    @GetMapping("/borrow-return")
    public List<BorrowRecord> getBorrowReturnRecords(@RequestParam(required = false) Long studentId) {
        if (studentId != null) {
            return librarianService.getBorrowHistoryForStudent(studentId);
        } else {
            return librarianService.getAllBorrowRecords();
        }
    }

    @PostMapping("/report")
    public List<BorrowRecord> getReportByStudents(@RequestBody List<Long> studentIds) {
        return librarianService.getBorrowRecordsByStudents(studentIds);
    }
}
