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
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String name, title, address, email;

  private Short phone;

  /**
   * @param id
   * @param name
   * @param address
   * @param phone
   * @param email
   * @param socials
   * @param title
   */
  public Resume(Long id, String name, String title, String address, Short phone, String email) {
    this.id = id;
    this.name = name;
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
}
