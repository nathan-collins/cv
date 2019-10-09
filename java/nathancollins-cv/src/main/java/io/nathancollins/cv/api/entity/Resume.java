package io.nathancollins.cv.api.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Resume
 * 
 * @author nathan collins
 */
@Entity
@Table(name = "resume")
public class Resume implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name, surname, title, address, email;
  private Short phone;

  /**
   * @param id
   * @param name
   * @param surname
   * @param title
   * @param address
   * @param phone
   * @param email
   */
  public Resume(Long id, String name, String surname, String title, String address, Short phone, String email) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.title = title;
    this.address = address;
    this.phone = phone;
    this.email = email;
  }

  /**
   * Identity number
   * 
   * @return
   */
  public Long getId() {
    return id;
  }

  /**
   * Set the identification number
   * 
   * @param id
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Get the name value
   * 
   * @return Full name on the resume
   */
  public String getName() {
    return name;
  }

  /**
   * Set the name
   * 
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Resume job title
   * 
   * @param title
   * @return
   */
  public String getTitle() {
    return title;
  }

  /**
   * Set the resume title
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Get the location of the resume
   * 
   * @return
   */
  public String getAddress() {
    return address;
  }

  /**
   * Set Address
   * 
   * @param address
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Get the phone number for the resume holder
   * 
   * @return
   */
  public Short getPhone() {
    return phone;
  }

  /**
   * Set the phone number for the resume holder
   * 
   * @param phone
   */
  public void setPhone(Short phone) {
    this.phone = phone;
  }

  /**
   * Get the email address of the resume holder
   */
  public String getEmail() {
    return email;
  }

  /**
   * Set the email address of the resume holder
   * 
   * @param email
   */
  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "Resume [" + "id=" + id + ", name=" + name + ", surname=" + surname + "title=" + title + ", address="
        + address + ", phone= " + phone + ", email=" + email + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (id == null ? 0 : id.hashCode());
    result = prime * result + (name == null ? 0 : name.hashCode());
    result = prime * result + (surname == null ? 0 : surname.hashCode());
    result = prime * result + (title == null ? 0 : title.hashCode());
    result = prime * result + (address == null ? 0 : address.hashCode());
    result = prime * result + (phone == null ? 0 : phone.hashCode());
    result = prime * result + (email == null ? 0 : email.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;

    Resume resume = (Resume) obj;

    boolean idEquals = (this.id == null && resume.id == null) || (this.id != null && this.id.equals(resume.id));
    boolean nameEquals = (this.name == null && resume.name == null)
        || (this.name != null && this.name.equals(resume.name));
    boolean surnameEquals = (this.surname == null && resume.surname == null)
        || (this.surname != null && this.surname.equals(resume.surname));
    boolean titleEquals = (this.title == null && resume.title == null)
        || (this.title != null && this.title.equals(resume.title));
    boolean addressEquals = (this.address == null && resume.address == null)
        || (this.address != null && this.address.equals(resume.address));
    boolean phoneEquals = (this.phone == null && resume.phone == null)
        || (this.phone != null && this.phone.equals(resume.phone));
    boolean emailEquals = (this.email == null && resume.email == null)
        || (this.email != null && this.email.equals(resume.email));

    return idEquals && nameEquals && surnameEquals && titleEquals && addressEquals && phoneEquals && emailEquals;
  }
}
