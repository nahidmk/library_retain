/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.16).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;


import io.swagger.model.Member;
import io.swagger.annotations.*;
import org.springframework.format.annotation.DateTimeFormat;
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
import org.threeten.bp.LocalDate;

import javax.validation.Valid;
import javax.validation.constraints.*;

import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-10-09T04:56:53.355Z")

@Api(value = "member", description = "the member API")
@RequestMapping(value = "")
public interface MemberApi {

    @ApiOperation(value = "Add a new Member", nickname = "addMember", notes = "", tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/member",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addMember(@ApiParam(value = "Member object that needs to be added" ,required=true )  @Valid @RequestBody Member body);


    @ApiOperation(value = "Deletes a publisher", nickname = "deleteMember", notes = "", tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Publisher not found") })
    @RequestMapping(value = "/member/{Id}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteMember(@ApiParam(value = "Publisher id to delete",required=true) @PathVariable("Id") Long id);


    @ApiOperation(value = "Find all Member", nickname = "findAllMember", notes = "Return all the Member as a list", response = Member.class, responseContainer = "List", tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Member.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid value") })
    @RequestMapping(value = "/member",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Member>> findAllMember();


    @ApiOperation(value = "Finds Member by Expire date", nickname = "findMemberByExpireDate", notes = "return a list of Member by Expire date", response = Member.class, responseContainer = "List", tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Member.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid Date value") })
    @RequestMapping(value = "/member/expiredate/{date}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Member>> findMemberByExpireDate(@ApiParam(value = "",required=true) @PathVariable("date") String date);


    @ApiOperation(value = "Finds Member by Joining date", nickname = "findMemberByJoiningDate", notes = "return a list of Member by Joining date", response = Member.class, responseContainer = "List", tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Member.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid Date value") })
    @RequestMapping(value = "/member/joindate/{date}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Member>> findMemberByJoiningDate(@ApiParam(value = "",required=true) @PathVariable("date")  String date);


    @ApiOperation(value = "Finds Member by type", nickname = "findMemberByType", notes = "return a list of Member by same Type", response = Member.class, responseContainer = "List", tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Member.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid type value") })
    @RequestMapping(value = "/member/type/{type}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Member>> findMemberByType(@ApiParam(value = "",required=true) @PathVariable("type") Member.MemberTypeEnum type);


    @ApiOperation(value = "Find Member by ID", nickname = "getMemberById", notes = "Returns a single Member", response = Member.class, tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Member.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Member not found") })
    @RequestMapping(value = "/member/{Id}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Member> getMemberById(@ApiParam(value = "ID of Member to return",required=true) @PathVariable("Id") Long id);


    @ApiOperation(value = "Find Member by Name", nickname = "getMemberByName", notes = "Returns a single Member", response = Member.class, tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Member.class),
        @ApiResponse(code = 400, message = "Invalid Name supplied"),
        @ApiResponse(code = 404, message = "Member not found") })
    @RequestMapping(value = "/member/by/{name}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Member> getMemberByName(@ApiParam(value = "ID of member to return",required=true) @PathVariable("name") String name);


    @ApiOperation(value = "Update an existing Member", nickname = "updateMember", notes = "", tags={ "Member", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Member not found"),
        @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(value = "/member",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateMember(@ApiParam(value = "Member object that needs to be added" ,required=true )  @Valid @RequestBody Member body);

}
