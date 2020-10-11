package io.swagger.api;

import io.swagger.Service.MemberService;
import io.swagger.model.Book;
import org.springframework.beans.factory.annotation.Autowired;

import io.swagger.model.Member;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
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
public class MemberApiController implements MemberApi {

    @Autowired
    private MemberService memberService;

    private static final Logger log = LoggerFactory.getLogger(MemberApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public MemberApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addMember(@ApiParam(value = "Member object that needs to be added" ,required=true )  @Valid @RequestBody Member body) {
        memberService.addMember(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteMember(@ApiParam(value = "Publisher id to delete",required=true) @PathVariable("Id") Long id) {
        try {

            memberService.deleteMember(id);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (NotFoundException e) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<List<Member>> findAllMember()
    {

        return ResponseEntity.ok(memberService.findAllMember());
    }

    public ResponseEntity<List<Member>> findMemberByExpireDate(@ApiParam(value = "",required=true) @PathVariable("date") String date) {
        return ResponseEntity.ok(memberService.findMemberByExpireDate(LocalDate.parse(date)));
    }

    public ResponseEntity<List<Member>> findMemberByJoiningDate(@ApiParam(value = "",required=true) @PathVariable("date")  String date) {
        return ResponseEntity.ok(memberService.findMemberByJoiningDate(LocalDate.parse(date)));
    }

    public ResponseEntity<List<Member>> findMemberByType(@ApiParam(value = "",required=true) @PathVariable("type") Member.MemberTypeEnum type) {
        return ResponseEntity.ok(memberService.findMemberByType(type));
    }

    public ResponseEntity<Member> getMemberById(@ApiParam(value = "ID of Member to return",required=true) @PathVariable("Id") Long id) {
        try {
            return ResponseEntity.ok(memberService.getMemberById(id));
        } catch (NotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }


    public ResponseEntity<List<Member>> getMemberByName(@ApiParam(value = "Name of member to return",required=true) @PathVariable("name") String name) {
    return ResponseEntity.ok(memberService.getMemberByName(name));

    }

    public ResponseEntity<Void> updateMember(@ApiParam(value = "Member object that needs to be added" ,required=true )  @Valid @RequestBody Member body) {
        try {
            memberService.updateMember(body);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (NotFoundException e) {
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }
    }

}
