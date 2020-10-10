package io.swagger.Repository;

import io.swagger.model.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.threeten.bp.LocalDate;


import java.util.List;

@Repository
public interface BorrowRepository extends JpaRepository<Borrow,Long> {
    List<Borrow> findByDueDate(LocalDate date);
    List<Borrow> findByReturnDate(LocalDate date);
    Borrow findById(Long id);
}
