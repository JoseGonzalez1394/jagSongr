package com.jagSongr.jagSongr.Controllers;

import com.jagSongr.jagSongr.Albums.Albums;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class SongrController {
    @GetMapping("/")
    public String splash(){
        return "splash.html";
    }
    @GetMapping("/hello")
    public String hello(){
        return "helloWorld.html";
    }
    @GetMapping("/capitalize/{word}")
    public String capitalize(@PathVariable String word, Model m){
        String cap = word.toUpperCase();
        m.addAttribute("capitalize", cap);
        return "capitalize.html";
    }


    @GetMapping("/albums")
    public String albums(Model m){
        Albums album1 = new Albums("Title 1","Artist 1",12, 2700, "\n" +
                "\n" +
                "C/O https://placeholder.com/"  );
        Albums album2 = new Albums("Title 2","Artist 2", 10, 2400, "\n" +
                "\n" +
                "C/O https://placeholder.com/");
        Albums album3 = new Albums("Title ", "Artist 3",16, 3600, "\n" +
                "\n" +
                "C/O https://placeholder.com/");
        m.addAttribute("title", album1.getTitle());
        // for each loop thymeleaf in html file
//        m.addAttribute("artist", albumShow);
//        m.addAttribute("songCount", albumShow);
//        m.addAttribute("length", albumShow);
//        m.addAttribute("imageURL", albumShow);
        return "albums.html";
    }

}
