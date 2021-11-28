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
    String lArtistName = pAlbum.getArtistName();
    String lAlbumName = pAlbum.getAlbumName();
    String lCover = pAlbum.getCover();
    String lSong1 = pAlbum.getSong1();
    String lSong2 = pAlbum.getSong2();
    String lSong3 = pAlbum.getSong3();
    String lSong4 = pAlbum.getSong4();

    Album lAlbum = new Album();
    lAlbum.setArtistName(lArtistName);
    lAlbum.setAlbumName(lAlbumName);
    lAlbum.setCover(lCover);
    lAlbum.setSong1(lSong1);
    lAlbum.setSong2(lSong2);
    lAlbum.setSong3(lSong3);
    lAlbum.setSong4(lSong4);
    lAlbum.setSongTitle1(pAlbum.getSongTitle1());
    lAlbum.setSongTitle2(pAlbum.getSongTitle2());
    lAlbum.setSongTitle3(pAlbum.getSongTitle3());
    lAlbum.setSongTitle4(pAlbum.getSongTitle4());

    lAlbumRepository.save(lAlbum);
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
// 