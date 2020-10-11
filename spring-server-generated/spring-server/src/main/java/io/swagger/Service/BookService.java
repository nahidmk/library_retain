package io.swagger.Service;

import io.swagger.Repository.BookRepository;
import io.swagger.api.BookApi;
import io.swagger.api.NotFoundException;
import io.swagger.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public void addBook(Book body) {
        bookRepository.save(body);
    }


    public void deleteBook(Long id) throws NotFoundException {
        if(bookRepository.exists(id))
        {
            bookRepository.delete(id);
        }else
            throw new NotFoundException(404,"notFount");
    }


    public List<Book> findAllBook() {
        return bookRepository.findAll();
    }


    public List<Book> findBookByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }


    public Book getBookById(Long id) throws NotFoundException {
        if(bookRepository.exists(id))
        {
            return bookRepository.findById(id);
        }else
        {
            throw new NotFoundException(404,"notFount");
        }
    }


    public List<Book> getBookByTitle(String title)  {
        return bookRepository.findByTitle(title);
    }


    public void updateBook(Book body) throws NotFoundException{
        if(bookRepository.exists(body.getId())) {
            bookRepository.save(body);
        }else {
            throw new NotFoundException(404,"notFount");
        }
    }
}
