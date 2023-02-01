package com.example.turistiando;

public class Hotel {

    private int photography;
    private String name;
    private String price;

    public Hotel(int photography, String name, String price) {
        this.photography = photography;
        this.name = name;
        this.price = price;
    }

    public int getPhotography() {
        return photography;
    }

    public void setPhotography(int photography) {
        this.photography = photography;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    //LastKey
}
