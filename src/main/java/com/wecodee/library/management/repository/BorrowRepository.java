package com.wecodee.library.management.repository;

import com.wecodee.library.management.model.BorrowRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BorrowRepository extends JpaRepository<BorrowRecord,Long> {

    List<BorrowRecord> findByUser_UserId(Long userId);
    Optional<BorrowRecord> findByBook_BookIdAndUser_UserIdAndReturnDateIsNull(Long bookId, Long userId);

}
