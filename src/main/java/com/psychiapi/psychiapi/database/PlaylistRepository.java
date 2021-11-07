package com.psychiapi.psychiapi.database;

import com.psychiapi.psychiapi.playlist.Playlist;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
  
}
