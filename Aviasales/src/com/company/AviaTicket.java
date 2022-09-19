package com.company;

public class AviaTicket {
    Person human;///Человек
    Country incoming;///Страна отправления
    Country departure;///Cтрана прибытия
    Price price;///Цена
    Plane plane;
    Airport airport;
    Flight flight;
    Boolean pack;

    public AviaTicket(){}

    public AviaTicket(Person human, Country incoming, Country departure, Price price, Plane plane, Airport airport, Flight flight, boolean pack ){
        this.human = human;
        this.incoming = incoming;
        this.departure = departure;
        this.price = price;
        this.plane = plane;
        this.airport = airport;
        this.flight = flight;
        this.pack = pack;
    }

    public void GetInfo(){
        System.out.println("Your ticket");
        System.out.println("================");
        human.GetInfo();
        System.out.println("================");

        System.out.println("Country of incoming: ");
        incoming.GetInfo();
        System.out.println("================");

        System.out.println("Country of departure: ");
        departure.GetInfo();
        System.out.println("================");

        System.out.println("Price of ticket: ");
        price.GetInfo();
        System.out.println("================");

        System.out.println("Plane information: ");
        plane.GetInfo();
        System.out.println("================");

        System.out.println("Airport incoming: ");
        airport.GetInfo();
        System.out.println("================");

        System.out.println("Flight number: ");
        flight.GetInfo();
        System.out.println("================");
    }

}


