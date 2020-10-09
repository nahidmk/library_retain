package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Member
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-10-09T04:56:53.355Z")


@Entity

public class Member   {
  @Id
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("phone")
  private String phone = null;

  /**
   * Gets or Sets memberType
   */
  public enum MemberTypeEnum {
    VIP("VIP"),
    
    PRIMIUM("PRIMIUM"),
    
    NORMAL("NORMAL");

    private String value;

    MemberTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MemberTypeEnum fromValue(String text) {
      for (MemberTypeEnum b : MemberTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("memberType")
  private MemberTypeEnum memberType = null;

  @JsonProperty("joiningDate")
  private LocalDate joiningDate = null;

  @JsonProperty("expireDate")
  private LocalDate expireDate = null;

  public Member id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Member name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Member address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Member email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Member phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Member memberType(MemberTypeEnum memberType) {
    this.memberType = memberType;
    return this;
  }

  /**
   * Get memberType
   * @return memberType
  **/
  @ApiModelProperty(value = "")


  public MemberTypeEnum getMemberType() {
    return memberType;
  }

  public void setMemberType(MemberTypeEnum memberType) {
    this.memberType = memberType;
  }

  public Member joiningDate(LocalDate joiningDate) {
    this.joiningDate = joiningDate;
    return this;
  }

  /**
   * Get joiningDate
   * @return joiningDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getJoiningDate() {
    return joiningDate;
  }

  public void setJoiningDate(LocalDate joiningDate) {
    this.joiningDate = joiningDate;
  }

  public Member expireDate(LocalDate expireDate) {
    this.expireDate = expireDate;
    return this;
  }

  /**
   * Get expireDate
   * @return expireDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(LocalDate expireDate) {
    this.expireDate = expireDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Member member = (Member) o;
    return Objects.equals(this.id, member.id) &&
        Objects.equals(this.name, member.name) &&
        Objects.equals(this.address, member.address) &&
        Objects.equals(this.email, member.email) &&
        Objects.equals(this.phone, member.phone) &&
        Objects.equals(this.memberType, member.memberType) &&
        Objects.equals(this.joiningDate, member.joiningDate) &&
        Objects.equals(this.expireDate, member.expireDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, email, phone, memberType, joiningDate, expireDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Member {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
    sb.append("    joiningDate: ").append(toIndentedString(joiningDate)).append("\n");
    sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

