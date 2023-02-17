package com.cc.febr08sze;

public class City {
    private String name = "";
    private int size = 0;


    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int size2 = 0;

    public City(String name) {
        this.name = name;
    }
}
