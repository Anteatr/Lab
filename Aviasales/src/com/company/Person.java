package com.company;

public class Person {
    String Name = "John";
    String SecondName = "Doe";

    public Person(){}

    public Person(String Name, String SecondName){
        this.Name=Name;
        this.SecondName=SecondName;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void GetInfo(){
        System.out.println("Name: " + this.Name);
        System.out.println("Second Name: " + this.SecondName);
    }
}
