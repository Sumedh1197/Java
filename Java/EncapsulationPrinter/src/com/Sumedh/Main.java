package com.Sumedh;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50,true);
        System.out.println("Initial page count is: " +printer.getNumPagesPrinted());
        int PagesPrinted= printer.Print(7);
        System.out.println("Pages Printed is: " +PagesPrinted);
        int PagesPrinted1= printer.Print(8);
        System.out.println("Page count now is:" +printer.getNumPagesPrinted());

    }
}
