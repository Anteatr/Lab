package com.company;

public class Airport {
    String address;

    public Airport(){}

    public Airport(String address){
        this.address= address;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void GetInfo(){
        System.out.println("Address of airport: " + this.address);
    }
}
