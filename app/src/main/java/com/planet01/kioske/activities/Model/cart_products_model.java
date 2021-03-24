package com.planet01.kioske.activities.Model;

public class cart_products_model {


    private String cart_product_title;
    private String cart_product_size;

    private double cart_product_price;
    private int cart_product_image;

    public  cart_products_model(String cart_product_title, String cart_product_size,double cart_product_price,int cart_product_image ){

        this.cart_product_title = cart_product_title;
        this.cart_product_size = cart_product_size;
        this.cart_product_price = cart_product_price;
        this.cart_product_image = cart_product_image;
    }

    public String getCart_product_title() {
        return cart_product_title;
    }

    public String getCart_product_size() {
        return cart_product_size;
    }

    public double getCart_product_price() {
        return cart_product_price;
    }

    public int getCart_product_image() {
        return cart_product_image;
    }
}
