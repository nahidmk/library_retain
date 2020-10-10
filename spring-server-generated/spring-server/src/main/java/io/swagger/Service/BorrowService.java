package io.swagger.Service;

import io.swagger.Repository.BorrowRepository;
import io.swagger.api.BorrowApi;
import io.swagger.api.NotFoundException;
import io.swagger.model.Borrow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.threeten.bp.LocalDate;


import java.util.List;

@Service
public class BorrowService {

    @Autowired
    private BorrowRepository borrowRepository;


    public void addBorrow(Borrow body) {
        borrowRepository.save(body);
    }


    public void deleteBorrow(Long id) throws NotFoundException {
        if(borrowRepository.exists(id)){
            borrowRepository.delete(id);
        }else{
            throw new NotFoundException(404,"notFount");
        }
    }


    public List<Borrow> findAllBorrow() {
        return borrowRepository.findAll();
    }

    
    public List<Borrow> findBorroByReturnDate(LocalDate date) {
        return borrowRepository.findByReturnDate(date);
    }


    public List<Borrow> findBorrowByDueDate(LocalDate date) {
        return borrowRepository.findByDueDate(date);
    }


    public Borrow getBorrowById(Long id) throws NotFoundException {
        if(borrowRepository.exists(id))
        {
            return borrowRepository.findById(id);
        }else {
            throw new NotFoundException(404,"notFount");
        }
    }


    public void updateBorrow(Borrow body) throws NotFoundException{
        if(borrowRepository.exists(body.getId()))
        {
            borrowRepository.save(body);
        }else{
            throw new NotFoundException(404,"notFount");
        }
    }
}
