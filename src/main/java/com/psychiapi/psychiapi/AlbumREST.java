package com.psychiapi.psychiapi;

import java.util.List;

import com.psychiapi.psychiapi.database.AlbumRepository;
import com.psychiapi.psychiapi.album.Album;

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
@RequestMapping("/Album")
public class AlbumREST {
  @Autowired
  private AlbumRepository lAlbumRepository;

  @GetMapping()
  public List<Album> GetAlbums(){
    return lAlbumRepository.findAll();
  }

  @PostMapping()
  public void SaveAlbum(@RequestBody Album pAlbum) {
    lAlbumRepository.save(pAlbum);
  }

  @PutMapping
  public void UpdateAlbum(@RequestBody Album pAlbum) {
    if (pAlbum.getId() > 0 && pAlbum.getId() != null)
      lAlbumRepository.save(pAlbum);
  }

  @DeleteMapping
  public void DeleteAlbum(@RequestBody Album pAlbum){
    lAlbumRepository.delete(pAlbum);
  }
}
