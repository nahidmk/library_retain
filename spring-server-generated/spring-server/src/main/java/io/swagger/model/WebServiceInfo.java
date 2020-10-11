package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

/**
 * WebServiceInfo
 */
@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-10-09T04:56:53.355Z")

public class WebServiceInfo {
    @JsonProperty("webServiceName")
    private String webServiceName = null;

    @JsonProperty("webServiceVersion")
    private String webServiceVersion = null;

    @JsonProperty("developerName")
    private String developerName = null;

    @JsonProperty("developerId")
    private String developerId = null;

    public WebServiceInfo webServiceName(String webServiceName) {
        this.webServiceName = webServiceName;
        return this;
    }

    /**
     * Get Web service Name
     * @return web service name
     **/
    @ApiModelProperty(value = "")


    public String getwebServiceName() {
        return webServiceName;
    }

    public void setwebServiceName(String webServiceName) {
        this.webServiceName = webServiceName;
    }

    public WebServiceInfo webServiceVersion(String webServiceVersion) {
        this.webServiceVersion = webServiceVersion;
        return this;
    }

    /**
     * Get web Service Version
     * @return webServiceVersion
     **/
    @ApiModelProperty(value = "")


    public String getwebServiceVersion() {
        return webServiceVersion;
    }

    public void setwebServiceVersion(String webServiceVersion) {
        this.webServiceVersion = webServiceVersion;
    }

    public WebServiceInfo developerName(String developerName) {
        this.developerName = developerName;
        return this;
    }

    /**
     * Get developer Name
     * @return developer Name
     **/
    @ApiModelProperty(value = "")


    public String getdeveloperName() {
        return developerName;
    }

    public void setdeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public WebServiceInfo developerId(String developerId) {
        this.developerId = developerId;
        return this;
    }

    /**
     * Get developer Id
     * @return developer Id
     **/
    @ApiModelProperty(value = "")


    public String getdeveloperId() {
        return developerId;
    }

    public void setdeveloperId(String developerId) {
        this.developerId = developerId;
    }



}
