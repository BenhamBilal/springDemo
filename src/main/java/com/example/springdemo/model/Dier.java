package com.example.springdemo.model;

import org.springframework.stereotype.Component;

@Component
public class Dier {

    private String naam,soort;
    private int lengte,gewicht;
    private char geslacht;

    public Dier() {
    }

    public Dier(String naam, String soort, int lengte, int gewicht, char geslacht) {
        this.naam = naam;
        this.soort = soort;
        this.lengte = lengte;
        this.gewicht = gewicht;
        this.geslacht = geslacht;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getSoort() {
        return soort;
    }

    public void setSoort(String soort) {
        this.soort = soort;
    }

    public int getLengte() {
        return lengte;
    }

    public void setLengte(int lengte) {
        this.lengte = lengte;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public char getGeslacht() {
        return geslacht;
    }

    public void setGeslacht(char geslacht) {
        this.geslacht = geslacht;
    }
}
