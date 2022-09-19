package com.company;

public class Flight {
    String StringNumber;
    int ArticalNumber;

    public Flight(){}

    public Flight(String StringNumber, int ArticalNumber){
        this.StringNumber=StringNumber;
        this.ArticalNumber=ArticalNumber;
    }

    public int getArticalNumber() {
        return ArticalNumber;
    }

    public String getStringNumber() {
        return StringNumber;
    }

    public void setArticalNumber(int articalNumber) {
        ArticalNumber = articalNumber;
    }

    public void setStringNumber(String stringNumber) {
        StringNumber = stringNumber;
    }

    public void GetInfo(){
        System.out.println(this.StringNumber + " " + this.ArticalNumber);
    }
}
