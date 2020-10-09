package io.swagger.api;

import io.swagger.Service.BookService;
import io.swagger.model.Book;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-10-09T04:56:53.355Z")

@Controller
public class BookApiController implements BookApi {

    @Autowired
    private BookService bookService;

    private static final Logger log = LoggerFactory.getLogger(BookApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BookApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addBook(@ApiParam(value = "Book object that needs to be added" ,required=true )  @Valid @RequestBody Book body) {
        bookService.addBook(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteBook(@ApiParam(value = "Book id to delete",required=true) @PathVariable("Id") Long id) {
        try {
            bookService.deleteBook(id);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (NotFoundException e) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<List<Book>> findAllBook() {

        return ResponseEntity.ok(bookService.findAllBook());
    }

    public ResponseEntity<List<Book>> findBookByAuthor(@ApiParam(value = "",required=true) @PathVariable("author") String author) {
        return ResponseEntity.ok(bookService.findBookByAuthor(author));
    }

    public ResponseEntity<Book> getBookById(@ApiParam(value = "ID of Book to return",required=true) @PathVariable("Id") Long id) {

        try {
            Book book = bookService.getBookById(id);
            return ResponseEntity.ok(book);
        } catch (NotFoundException e) {
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }


    }

    public ResponseEntity<Book> getBookByTitle(@ApiParam(value = "Title of Book to return",required=true) @PathVariable("title") String title) {

        try {
            Book book = bookService.getBookByTitle(title);
            return ResponseEntity.ok(book);
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
        return ResponseEntity.notFound().build();

    }

    public ResponseEntity<Void> updateBook(@ApiParam(value = "Book object that needs to be added" ,required=true )  @Valid @RequestBody Book body) {

        try {
            bookService.updateBook(body);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (NotFoundException e) {
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }

    }

}
