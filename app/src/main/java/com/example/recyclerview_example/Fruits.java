package com.example.recyclerview_example;

public class Fruits {

    private String name;
    private String color;
    private String imageurl;

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public Fruits(String name, String color, String imageurl) {
        this.name = name;
        this.color = color;
        this.imageurl = imageurl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", imageurl='" + imageurl + '\'' +
                '}';
    }
}
