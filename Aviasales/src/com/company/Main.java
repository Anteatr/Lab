package com.company;

import javax.naming.Name;

public class Main {
    public static void main(String[] args) {
        String name = "Nikita";
        String secondname = "Degtarev";
        Person human = new Person(name,secondname);///Человек

        String CountryNameIn = "Russia";
        String CountryNameOut = "Brazil";
        Country incoming = new Country(CountryNameIn);///Страна отправления
        Country departure = new Country(CountryNameOut);///Cтрана прибытия

        Price price = new Price(10000);///Цена

        String NamePlane = "Alexandr |||";
        int SerialNumber = 777;
        Plane plane = new Plane(NamePlane,SerialNumber);

        String address = "Pulkovo 2";
        Airport airport = new Airport(address);

        Flight flight = new Flight("AB",15);
        Boolean pack = true;

        AviaTicket ticket = new AviaTicket(human, incoming,departure,price,plane,airport,flight,pack);
        ticket.GetInfo();
    }
}
