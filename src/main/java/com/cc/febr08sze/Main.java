package com.cc.febr08sze;

public class Main {

    public static void main(String[] args) {
        City city1 = new City("Moscow");
        city1.setSize(100);
        City city2 = new City("Petrograd");
        Country c1 = new Country("Russia");
        c1.cities.add(city1);
        c1.cities.add(city2);
       // System.out.println(c1.getName());  //private-ra van állítva a Country.java fájlban
        System.out.println(c1.cities.size());
    }
}
