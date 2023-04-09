package com.example.makeup;

import java.util.ArrayList;

public class Pojo {
    public String id;
    public String brand;
    public String name;
    public String price;
    public String price_sign;
    public String currency;
    public String image_link;
    public String product_link;
    public String website_link;
    public String description;
    public Object rating;
    public String category;
    public String product_type;
    public ArrayList<String> tag_list;
    public String created_at;
    public String updated_at;
    public String product_api_url;
    public String api_featured_image;
    public ArrayList<ProductColor> product_colors;

    public Pojo(String id, String brand, String name, String price, String price_sign, String currency, String image_link, String product_link, String website_link, String description, Object rating, String category, String product_type, ArrayList<String> tag_list, String created_at, String updated_at, String product_api_url, String api_featured_image, ArrayList<ProductColor> product_colors) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.price_sign = price_sign;
        this.currency = currency;
        this.image_link = image_link;
        this.product_link = product_link;
        this.website_link = website_link;
        this.description = description;
        this.rating = rating;
        this.category = category;
        this.product_type = product_type;
        this.tag_list = tag_list;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.product_api_url = product_api_url;
        this.api_featured_image = api_featured_image;
        this.product_colors = product_colors;
    }

    public String getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getPrice_sign() {
        return price_sign;
    }

    public String getCurrency() {
        return currency;
    }

    public String getImage_link() {
        return image_link;
    }

    public String getProduct_link() {
        return product_link;
    }

    public String getWebsite_link() {
        return website_link;
    }

    public String getDescription() {
        return description;
    }

    public Object getRating() {
        return rating;
    }

    public String getCategory() {
        return category;
    }

    public String getProduct_type() {
        return product_type;
    }

    public ArrayList<String> getTag_list() {
        return tag_list;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public String getProduct_api_url() {
        return product_api_url;
    }

    public String getApi_featured_image() {
        return api_featured_image;
    }

    public ArrayList<ProductColor> getProduct_colors() {
        return product_colors;
    }

    class ProductColor{
        public String hex_value;
        public String colour_name;

        public ProductColor(String hex_value, String colour_name) {
            this.hex_value = hex_value;
            this.colour_name = colour_name;
        }

        public String getHex_value() {
            return hex_value;
        }

        public String getColour_name() {
            return colour_name;
        }
    }
}
