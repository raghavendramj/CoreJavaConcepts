package com.learning.functional.streams;

public class Mobile {
    String model;
    int imeiNumber;
    float price;
    String brand;

    public Mobile(String model, int imeiNumber, float price, String brand) {
        this.model = model;
        this.imeiNumber = imeiNumber;
        this.price = price;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "model='" + model + '\'' +
                ", imeiNumber=" + imeiNumber +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
