package com.Sumedh;



    public class DeluxBurger extends Hamburger {
        public DeluxBurger() {
            super("Deluxe", "Sausage and Bacon", 30, "Multi-Grain");
            super.Addition1("Chips",8);
            super.Addition2("Drinks",4);
        }

        @Override
        public void Addition1(String name, double amt) {
            System.out.println("Cannot add additional items to a deluxe burger");
        }

        @Override
        public void Addition2(String name, double amt) {
            System.out.println("Cannot add additional items to a deluxe burger");
        }

        @Override
        public void Addition3(String name, double amt) {
            System.out.println("Cannot add additional items to a deluxe burger");
        }

        @Override
        public void Addition4(String name, double amt) {
            System.out.println("Cannot add additional items to a deluxe burger");
        }
    }


