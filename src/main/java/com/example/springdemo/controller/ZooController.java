package com.example.springdemo.controller;

import com.example.springdemo.model.Dier;
import com.example.springdemo.model.DierDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.PublicKey;
import java.util.ArrayList;

@Controller
public class ZooController {

    private DierDataSource dierDataSource;

    //dependecy injection
    @Autowired
    public ZooController(DierDataSource dierDataSource) {
        this.dierDataSource = dierDataSource;
    }

    @GetMapping("/dier")
    @ResponseBody
    public ArrayList<Dier> getAllDieren() {
        return dierDataSource.getDierenLijst();
    }

    @PostMapping("/dier")
    @ResponseBody
    public HttpStatus /* to give a statut response for example '200 for ok ' */ addDier(@RequestParam String naam , @RequestParam String soort , @RequestParam int lengte, @RequestParam int gewicht , @RequestParam(defaultValue = "X") char geslacht ){
        dierDataSource.addDier(naam, soort, lengte, gewicht, geslacht);
        return HttpStatus.OK;
    }

} tv
