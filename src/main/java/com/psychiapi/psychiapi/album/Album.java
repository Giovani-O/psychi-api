package com.psychiapi.psychiapi.album;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity

public class Album {
  // Define que o id será gerado automaticamente
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  // Nome do artista
  @Column(nullable = false)
  private String artistName;

  // Nome do album
  @Column(nullable = false)
  private String albumName;

  // Capa do album !
  @Lob
  private String cover;

  // Lista de músicas
  @Lob
  private String song1;

  @Lob
  private String song2;

  @Lob
  private String song3;

  @Lob
  private String song4;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getArtistName() {
    return artistName;
  }

  public void setArtistName(String artistName) {
    this.artistName = artistName;
  }

  public String getAlbumName() {
    return albumName;
  }

  public void setAlbumName(String albumName) {
    this.albumName = albumName;
  }

  public String getCover() {
    return cover;
  }

  public void setCover(String cover) {
    this.cover = cover;
  }

  public String getSong1() {
    return song1;
  }

  public void setSong1(String song1) {
    this.song1 = song1;
  }

  public String getSong2() {
    return song2;
  }

  public void setSong2(String song2) {
    this.song2 = song2;
  }

  public String getSong3() {
    return song3;
  }

  public void setSong3(String song3) {
    this.song3 = song3;
  }

  public String getSong4() {
    return song4;
  }

  public void setSong4(String song4) {
    this.song4 = song4;
  }

  

  
}
