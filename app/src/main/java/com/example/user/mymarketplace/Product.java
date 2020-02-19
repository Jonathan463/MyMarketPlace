package com.example.user.mymarketplace;

/**
 * Created by user on 11/23/2019.
 */

public class Product {

    private int id;
    private String title;
    private int image;
    private double price;
    private String description;

    public Product(int id, String title, int image, double price, String description) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }

    public double getPrice() {
        return price;
    }
    public String getDescription(){return description;}
}
