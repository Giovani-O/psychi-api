package com.psychiapi.psychiapi.album;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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

  // Capa do album
  @Column(nullable = false)
  private String cover;

  // Lista de objetos contendo as músicas
  @Column(nullable = false)
  private String songs;

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

  public String getSongs() {
    return songs;
  }

  public void setSongs(String songs) {
    this.songs = songs;
  }

  
}
