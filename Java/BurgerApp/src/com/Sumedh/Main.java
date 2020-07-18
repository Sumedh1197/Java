package com.Sumedh;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger= new Hamburger("Basic","Sausage",20,"Loaf");
        double price= hamburger.ItemizeHamburger();
        hamburger.Addition1("Cheese",5);
        hamburger.Addition2("Lettuce", 6);
        hamburger.Addition3("Tomatoes",3);
        price= hamburger.ItemizeHamburger();
        System.out.println("Total price is :"+price);

        HealthyBurger healthy= new HealthyBurger("Bacon",22);
        healthy.Addition1("Beans",10);
        healthy.addAddition1("Lettuce", 6);
        System.out.println("final price is :" +healthy.ItemizeHamburger());

        DeluxBurger deluxe= new DeluxBurger();
        System.out.println("final price is: " +deluxe.ItemizeHamburger());

    }
}
