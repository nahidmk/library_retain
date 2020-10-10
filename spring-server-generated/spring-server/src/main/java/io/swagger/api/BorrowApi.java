/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.16).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Borrow;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-10-09T04:56:53.355Z")

@Api(value = "borrow", description = "the borrow API")
@RequestMapping(value = "")
public interface BorrowApi {

    @ApiOperation(value = "Add a new Borrow", nickname = "addBorrow", notes = "", tags={ "Borrow", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/borrow",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addBorrow(@ApiParam(value = "Brorow object that needs to be added" ,required=true )  @Valid @RequestBody Borrow body);


    @ApiOperation(value = "Deletes a Borrow", nickname = "deleteBorrow", notes = "", tags={ "Borrow", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Borrow not found") })
    @RequestMapping(value = "/borrow/{Id}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteBorrow(@ApiParam(value = "Borrow id to delete",required=true) @PathVariable("Id") Long id);


    @ApiOperation(value = "Find all Borrow", nickname = "findAllBorrow", notes = "Return all the Borrow as a list", response = Borrow.class, responseContainer = "List", tags={ "Borrow", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Borrow.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid value") })
    @RequestMapping(value = "/borrow",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Borrow>> findAllBorrow();


    @ApiOperation(value = "Finds Member by Return date", nickname = "findBorroByReturnDate", notes = "return a list of Borro by Return date", response = Borrow.class, responseContainer = "List", tags={ "Borrow", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Borrow.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid Date value") })
    @RequestMapping(value = "/borrow/returndate/{date}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Borrow>> findBorroByReturnDate(@ApiParam(value = "",required=true) @PathVariable("date") String date);


    @ApiOperation(value = "Finds Member by Due date", nickname = "findBorrowByDueDate", notes = "return a list of Borrow by Due date", response = Borrow.class, responseContainer = "List", tags={ "Borrow", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Borrow.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid Date value") })
    @RequestMapping(value = "/borrow/duedate/{date}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Borrow>> findBorrowByDueDate(@ApiParam(value = "",required=true) @PathVariable("date") String date);


    @ApiOperation(value = "Find Borrow by ID", nickname = "getBorrowById", notes = "Returns a single Borrow", response = Borrow.class, tags={ "Borrow", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Borrow.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Borrow not found") })
    @RequestMapping(value = "/borrow/{Id}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Borrow> getBorrowById(@ApiParam(value = "ID of Borrow to return",required=true) @PathVariable("Id") Long id);


    @ApiOperation(value = "Update an existing Borrow", nickname = "updateBorrow", notes = "", tags={ "Borrow", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Borrow not found"),
        @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(value = "/borrow",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateBorrow(@ApiParam(value = "Borrow object that needs to be added" ,required=true )  @Valid @RequestBody Borrow body);

}
