package com.jbajracharya.songr;

import org.apache.tomcat.util.bcel.classfile.EnumElementValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/hello")
    public String getHome() {
        return "hello";
    }

    @GetMapping("/capitalize/{title}")
    public String getCapitalizedHello(@PathVariable String title, Model m) {
        m.addAttribute("heading", title);
        return "capitalize";
    }

    @GetMapping("/albums")
    public String displayAlbums(Model m) {
//        Album[] albums = new Album[] {new Album("Rain", "Jimi Hendrix", 6, 1800, "https://cdn.smehost.net/jimihendrixcom-uslegacyprod/wp-content/uploads/2015/10/HENDRIX_PurpleBox_coverSQUARE-1024x1024.jpg"),
//                new Album("Encore", "Eminem", 10, 3000, "https://upload.wikimedia.org/wikipedia/en/thumb/b/b4/Encore_%28Eminem_album%29_coverart.jpg/220px-Encore_%28Eminem_album%29_coverart.jpg"),
//        new Album("The Cream of Clapton", "Eric Claption", 9, 2800, "https://upload.wikimedia.org/wikipedia/en/thumb/6/65/CreamOfClapton.jpg/220px-CreamOfClapton.jpg)")
//        };
//        m.addAttribute("albumArray", albums);
//        albumRepository.save(albums[0]);

        List<Album> albums = albumRepository.findAll();
        m.addAttribute("albumArray", albums);
        return "albums";
    }

    @PostMapping("/albums")
    public RedirectView postAlbums(String title, String artist, int songCount, int seconds, String imageUrl){
        Album newAlbum = new Album(title, artist, songCount, seconds, imageUrl);
        System.out.println("newAlbum.getTitle() = " + newAlbum.getTitle() + title);
        albumRepository.save(newAlbum);

        return new RedirectView("/albums");
    }

}
