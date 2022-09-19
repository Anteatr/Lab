package com.company;

public class Plane {
    String name;
    int SerialNumber;

    public Plane(){}

    public Plane(String name, int SerialNumber){
        this.name=name;
        this.SerialNumber=SerialNumber;
    }

    public String getName() {
        return name;
    }

    public int getSerialNumber() {
        return SerialNumber;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSerialNumber(int serialNumber) {
        SerialNumber = serialNumber;
    }

    public void GetInfo(){
        System.out.println("Name of plane: " + this.name);
        System.out.println("Serial number of plane: " + this.SerialNumber);
    }
}
