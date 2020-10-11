package io.swagger.api;

import io.swagger.model.Book;
import io.swagger.model.WebServiceInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-10-09T04:56:53.355Z")

@Controller
public class WebServiceInfoController implements WebServiceInfoApi {
    @Override
    public ResponseEntity<WebServiceInfo> getWebServiceInfo() {

        WebServiceInfo info  = new WebServiceInfo();
        info.setwebServiceName("Library Retain");
        info.setdeveloperId("2017000000092");
        info.setdeveloperName("Md. Nahidul Islam");
        info.setwebServiceVersion("1.0.0");
        return ResponseEntity.ok(info);
    }
}
