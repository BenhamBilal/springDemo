package com.example.springdemo.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class DierDataSource {

    private ArrayList<Dier> dierenLijst;

    public DierDataSource() {
        dierenLijst = new ArrayList<>();
        dierenLijst.add(new Dier("Simba","Tijger",200,200,'F'));
        dierenLijst.add(new Dier("Nelly","Olifqnt",300,500,'F'));
    }

    public ArrayList<Dier> getDierenLijst() {
        return dierenLijst;
    }

    public void addDier(String naam , String soort ,int lengte, int gewicht , char geslacht ) {
        dierenLijst.add(new Dier(naam,soort,lengte,gewicht,geslacht));
    }

}
