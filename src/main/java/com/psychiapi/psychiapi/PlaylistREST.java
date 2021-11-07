package com.psychiapi.psychiapi;

import java.util.List;

import com.psychiapi.psychiapi.database.PlaylistRepository;
import com.psychiapi.psychiapi.playlist.Playlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Playlist")
public class PlaylistREST {
  @Autowired
  private PlaylistRepository lPlaylistRepository;

  @GetMapping
  public List<Playlist> GetPlaylists(){
    return lPlaylistRepository.findAll();
  }

  @PostMapping
  public void SavePlaylist(@RequestBody Playlist pPlaylist) {
    lPlaylistRepository.save(pPlaylist);
  }

  @PutMapping
  public void UpdatePlaylist(@RequestBody Playlist pPlaylist) {
    if (pPlaylist.getId() > 0 && pPlaylist.getId() != null)
      lPlaylistRepository.save(pPlaylist);
  }

  @DeleteMapping
  public void DeletePlaylist(@RequestBody Playlist pPlaylist){
    lPlaylistRepository.delete(pPlaylist);
  }
}
