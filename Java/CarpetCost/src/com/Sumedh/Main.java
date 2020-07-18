package com.Sumedh;

public class Main {

    public static void main(String[] args) {
        Floor floor= new Floor(6,5);
        Carpet carpet= new Carpet(8);
        Calculator calculator= new Calculator(floor,carpet);
        System.out.println("The total cost of the carpet is :" +calculator.getTotalCost());
    }
}
