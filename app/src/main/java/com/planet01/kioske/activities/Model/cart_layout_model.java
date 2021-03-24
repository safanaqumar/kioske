package com.planet01.kioske.activities.Model;

public class cart_layout_model {

    private String cart_layout_product_title;
    private String cart_layout_product_size;
    private double cart_layout_product_price;
    private int cart_layout_product_image;


    public  cart_layout_model(String cart_layout_product_title, String cart_layout_product_size,double cart_layout_product_price,int cart_layout_product_image){
        this.cart_layout_product_title = cart_layout_product_title;
        this.cart_layout_product_size = cart_layout_product_size;
        this.cart_layout_product_price = cart_layout_product_price;
        this.cart_layout_product_image = cart_layout_product_image;
    }

    public String getCart_layout_product_title() {
        return cart_layout_product_title;
    }

    public String getCart_layout_product_size() {
        return cart_layout_product_size;
    }

    public double getCart_layout_product_price() {
        return cart_layout_product_price;
    }

    public int getCart_layout_product_image() {
        return cart_layout_product_image;
    }
}
