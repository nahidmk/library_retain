package io.swagger.model;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Book;
import io.swagger.model.Member;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Borrow
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-10-09T04:56:53.355Z")



@Entity
public class Borrow   {
  @Id
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("dueDate")
  private LocalDate dueDate = null;

  @JsonProperty("returnDate")
  private LocalDate returnDate = null;

@OneToMany
  @JsonProperty("book")
  private List<Book> bookList = null;

 @ManyToOne
  @JsonProperty("member")
  private Member member = null;

  public Borrow id(Long id) {
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

  public Borrow dueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Get dueDate
   * @return dueDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDate dueDate) {
    this.dueDate = dueDate;
  }

  public Borrow returnDate(LocalDate returnDate) {
    this.returnDate = returnDate;
    return this;
  }

  /**
   * Get returnDate
   * @return returnDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getReturnDate() {
    return returnDate;
  }

  public void setReturnDate(LocalDate returnDate) {
    this.returnDate = returnDate;
  }

  public Borrow booklist(List<Book> bookList) {
    this.bookList = bookList;
    return this;
  }

  /**
   * Get book
   * @return book
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Book> getBook() {
    return bookList;
  }

  public void setBook(List<Book> bookList) {
    this.bookList = bookList;
  }

  public Borrow member(Member member) {
    this.member = member;
    return this;
  }

  /**
   * Get member
   * @return member
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Member getMember() {
    return member;
  }

  public void setMember(Member member) {
    this.member = member;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Borrow borrow = (Borrow) o;
    return Objects.equals(this.id, borrow.id) &&
        Objects.equals(this.dueDate, borrow.dueDate) &&
        Objects.equals(this.returnDate, borrow.returnDate) &&
        Objects.equals(this.bookList, borrow.bookList) &&
        Objects.equals(this.member, borrow.member);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dueDate, returnDate, bookList, member);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Borrow {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    returnDate: ").append(toIndentedString(returnDate)).append("\n");
    sb.append("    book: ").append(toIndentedString(bookList)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
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

