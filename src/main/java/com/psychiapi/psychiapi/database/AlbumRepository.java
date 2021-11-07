package com.psychiapi.psychiapi.database;

import com.psychiapi.psychiapi.album.Album;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
  
}
