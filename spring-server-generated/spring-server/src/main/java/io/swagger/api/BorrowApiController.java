package io.swagger.api;

import io.swagger.Service.BorrowService;
import io.swagger.model.Borrow;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.threeten.bp.LocalDate;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-10-09T04:56:53.355Z")

@Controller
public class BorrowApiController implements BorrowApi {

    @Autowired
    private BorrowService borrowService;

    private static final Logger log = LoggerFactory.getLogger(BorrowApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BorrowApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addBorrow(@ApiParam(value = "Brorow object that needs to be added" ,required=true )  @Valid @RequestBody Borrow body) {
        borrowService.addBorrow(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteBorrow(@ApiParam(value = "Borrow id to delete",required=true) @PathVariable("Id") Long id) {

        try {
            borrowService.deleteBorrow(id);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (NotFoundException e) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<List<Borrow>> findAllBorrow() {
        return ResponseEntity.ok(borrowService.findAllBorrow());
    }

    public ResponseEntity<List<Borrow>> findBorroByReturnDate(@ApiParam(value = "",required=true) @PathVariable("date") String date) {
        return ResponseEntity.ok(borrowService.findBorroByReturnDate(LocalDate.parse(date)));
    }

    public ResponseEntity<List<Borrow>> findBorrowByDueDate(@ApiParam(value = "",required=true) @PathVariable("date") String date) {
        return ResponseEntity.ok(borrowService.findBorrowByDueDate(LocalDate.parse(date)));
    }

    public ResponseEntity<Borrow> getBorrowById(@ApiParam(value = "ID of Borrow to return",required=true) @PathVariable("Id") Long id) {
        try {

            return ResponseEntity.ok(borrowService.getBorrowById(id));
        } catch (NotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Void> updateBorrow(@ApiParam(value = "Borrow object that needs to be added" ,required=true )  @Valid @RequestBody Borrow body) {
        try {
            borrowService.updateBorrow(body);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (NotFoundException e) {
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }
    }

}
