package com.example.moviesmigration.demo.service;


import org.hibernate.service.spi.InjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.swing.text.html.parser.Entity;


@Controller
public class ListProviderService {
    @GetMapping(value = "https://imdblistids.herokuapp.com/api/v1/movie/imdb/ids")
    public ResponseEntity fetchAllIds(){
        return new ResponseEntity(HttpStatus.OK);
        //??
    }

}
