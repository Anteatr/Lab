package com.company;

public class Price {
    int price;

    public Price(){}

    public Price(int price){
        this.price = price;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        while (true) {
            if (price > 0) {
                this.price = price;
                break;
            }
        }
    }

    public void GetInfo(){
        System.out.println(this.price + "$");
    }
}
