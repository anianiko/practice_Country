package com.cc.febr08sze;

import java.util.ArrayList;

public class Country {

    public ArrayList<City> cities = new ArrayList<City>();
    private String name ="";   //osztályszintű globális változó

    private String getName() {
        return name;
    }

    //konstruktort írunk, és ezen keresztül adunk nevet
    //ugyanaz a metódus neve, mint az osztály neve, igy lesz konstruktor
    public Country(String name){
        this.name = name;        //Tamás: (this=maga az osztály, itt a Country osztály, önmaga.) Marci: a példányt jelenti
    }
}
