package com.wecodee.library.management.repository;

import com.wecodee.library.management.model.BorrowRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BorrowRepository extends JpaRepository<BorrowRecord,Long> {

    List<BorrowRecord> findByStudent_Id(Long studentId);
    Optional<BorrowRecord> findByBook_BookIdAndStudent_IdAndReturnDateIsNull(Long bookId, Long studentId);

}
