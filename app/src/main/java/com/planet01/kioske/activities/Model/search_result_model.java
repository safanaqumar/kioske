package com.planet01.kioske.activities.Model;

public class search_result_model {

    private String search_product_title;
    private String search_product_size;

    private double search_product_price;
    private int search_product_image;

    public search_result_model(String search_product_title, String search_product_size, double search_product_price, int search_product_image ){
this.search_product_title = search_product_title;
this.search_product_size = search_product_size;
this.search_product_price = search_product_price;
this.search_product_image = search_product_image;
    }

    public String getSearch_product_title() {
        return search_product_title;
    }

    public String getSearch_product_size() {
        return search_product_size;
    }

    public double getSearch_product_price() {
        return search_product_price;
    }

    public int getSearch_product_image() {
        return search_product_image;
    }
}
