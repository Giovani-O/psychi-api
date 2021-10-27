package com.psychiapi.psychiapi.user;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity

public class User {
  // Define que o id será gerado automaticamente
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  // @Column(nullable = false) para tornar um campo obrigatório
  private Long id;
  @Column(nullable = false)
  private String name;
  @Column(nullable = false)
  private String email;
  @Column(nullable = false)
  private String password;
  @Column(nullable = false)
  private Boolean artist;

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public Boolean getArtist() {
    return artist;
  }
  public void setArtist(Boolean artist) {
    this.artist = artist;
  }
}
