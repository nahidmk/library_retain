package io.swagger.api;

import io.swagger.annotations.*;
import io.swagger.model.Book;
import io.swagger.model.WebServiceInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-10-09T04:56:53.355Z")

@Api(value = "WebServiceInfo", description = "the WebSErviceInfo API")
@RequestMapping(value = "")

public interface WebServiceInfoApi {

    @ApiOperation(value = "Find Web service information ", nickname = "getWebServiceInfo", notes = "Returns informaton of web service", response = WebServiceInfo.class, tags={ "Web-Service-Information", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation", response = WebServiceInfo.class),
            @ApiResponse(code = 400, message = "Invalid value supplied"),
            @ApiResponse(code = 404, message = "Web service information not found") })
    @RequestMapping(value = "/web-service-info",
            produces = {  "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<WebServiceInfo> getWebServiceInfo();

}
