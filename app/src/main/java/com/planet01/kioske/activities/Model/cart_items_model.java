package com.planet01.kioske.activities.Model;

public class cart_items_model {

    private int id;
    private String product_title;
    private String product_size;

    private double product_price;
    private int product_image;

    public cart_items_model(int id, String product_title, String product_size, double product_price, int product_image) {
        this.id = id;
        this.product_title = product_title;
        this.product_size = product_size;
        this.product_price = product_price;
        this.product_image = product_image;
    }


    public String getProduct_title() {
        return product_title;
    }

    public String getProduct_size() {
        return product_size;
    }

    public double getProduct_price() {
        return product_price;
    }

    public int getProduct_image() {
        return product_image;
    }

    public int getId() {
        return id;
    }
}
