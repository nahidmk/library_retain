package io.swagger.api;

import io.swagger.Service.PublisherService;
import io.swagger.model.Publisher;
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
public class PublishApiController implements PublishApi {

    @Autowired
    private PublisherService publisherService;

    private static final Logger log = LoggerFactory.getLogger(PublishApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PublishApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addPublish(@ApiParam(value = "publisher object that needs to be added" ,required=true )  @Valid @RequestBody Publisher body) {
        publisherService.addPublish(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deletePublisher(@ApiParam(value = "Publisher id to delete",required=true) @PathVariable("Id") Long id) {

        try {
            publisherService.deletePublisher(id);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (NotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<List<Publisher>> findAllPublish() {
        return ResponseEntity.ok(publisherService.findAllPublish());
    }

    public ResponseEntity<List<Publisher>> getPublisherByName(@ApiParam(value = "ID of puhlisher to return",required=true) @PathVariable("name") String name) {

        return ResponseEntity.ok(publisherService.getPublisherByName(name));
    }

    public ResponseEntity<Publisher> getpublisherById(@ApiParam(value = "ID of publisher to return",required=true) @PathVariable("Id") Long id) {
        try {
            Publisher publisher = publisherService.getpublisherById(id);
            return ResponseEntity.ok(publisher);
        } catch (NotFoundException e) {
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }

    }

    public ResponseEntity<Void> updatepublish(@ApiParam(value = "publish object that needs to be added" ,required=true )  @Valid @RequestBody Publisher body) {
        try {
            publisherService.updatepublish(body);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (NotFoundException e) {
            e.printStackTrace();
            return ResponseEntity.notFound().build();
        }

    }

}
