package com.Sumedh;

public class HealthyBurger extends Hamburger{
    public String HealthyExtra1Name;
    private double HealthyExtra1Price;
    public String HealthyExtra2Name;
    private double HealthyExtra2Price;

    public HealthyBurger( String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");
    }
    public void addAddition1(String name, double price) {
        this.HealthyExtra1Name = name;
        this.HealthyExtra1Price = price;
    }
    public void addAddition2(String name, double price) {
        this.HealthyExtra2Name = name;
        this.HealthyExtra2Price = price;
    }

    @Override
    public double ItemizeHamburger() {
        double hamburgerPrice= super.ItemizeHamburger();
        if(this.HealthyExtra1Name!=null){
            hamburgerPrice+=this.HealthyExtra1Price;
            System.out.println("Added: " +this.HealthyExtra1Name+" for a price of: " +this.HealthyExtra1Price);
        }
        if(this.HealthyExtra2Name!=null){
            hamburgerPrice+=this.HealthyExtra2Price;
            System.out.println("Added: " +this.HealthyExtra2Name+" for a price of: " +this.HealthyExtra2Price);
        }
        return hamburgerPrice;
    }
}
