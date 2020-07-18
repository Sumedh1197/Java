package com.Sumedh;

public class Hamburger {
    private String name;
    private String meat;
    private double Price;
    private String BreadRoll;
    private String Addition1Name;
    private double AdditionAmt1;
    private String Addition2Name;
    private double AdditionAmt2;
    private String Addition3Name;
    private double AdditionAmt3;
    private String Addition4Name;
    private double AdditionAmt4;

    public Hamburger(String name, String meat, double price, String breadRoll) {
        this.name = name;
        this.meat = meat;
        Price = price;
        BreadRoll = breadRoll;
    }

    public void Addition1(String name, double amt) {
        this.Addition1Name = name;
        this.AdditionAmt1 = amt;
    }

    public void Addition2(String name, double amt) {
        this.Addition2Name = name;
        this.AdditionAmt2 = amt;
    }

    public void Addition3(String name, double amt) {
        this.Addition3Name = name;
        this.AdditionAmt3 = amt;
    }

    public void Addition4(String name, double amt) {
        this.Addition4Name = name;
        this.AdditionAmt4 = amt;
    }

    public double ItemizeHamburger() {
        double HamburgerPriceBase = this.Price;
        System.out.println("Basic price of " + this.name + " with " + this.meat + " and roll type of " +
                this.BreadRoll + " is : " + this.Price);

        if (this.Addition1Name != null) {
            HamburgerPriceBase += this.AdditionAmt1;
            System.out.println("Added " + this.Addition1Name + " for an extra " + this.AdditionAmt1);
        }
        if (this.Addition2Name != null) {
            HamburgerPriceBase += this.AdditionAmt2;
            System.out.println("Added " + this.Addition2Name + " for an extra " + this.AdditionAmt2);
        }
        if (this.Addition3Name != null) {
            HamburgerPriceBase += this.AdditionAmt3;
            System.out.println("Added " + this.Addition3Name + " for an extra " + this.AdditionAmt3);
        }
        if (this.Addition4Name != null) {
            HamburgerPriceBase += this.AdditionAmt4;
            System.out.println("Added " + this.Addition4Name + " for an extra " + this.AdditionAmt4);
        }
        return HamburgerPriceBase;
    }
}


