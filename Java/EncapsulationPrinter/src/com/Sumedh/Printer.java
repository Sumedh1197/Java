package com.Sumedh;



public class Printer {
    private int TonerLevel;
    private int NumPagesPrinted;
    private boolean Duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(TonerLevel>=-1 || TonerLevel<=100){
            TonerLevel = tonerLevel;
        }
        else{
            this.TonerLevel=-1;
        }
        this.NumPagesPrinted = 0;
        this.Duplex = duplex;
    }

    public int Toner(int AddToner){
        if(AddToner>0 && AddToner<=100){
            this.TonerLevel+=AddToner;
            return this.TonerLevel;
        }
        else{
            return -1;
        }
    }
    public int Print(int PrintPages){
        int PagesToPrint= PrintPages;
        if(this.Duplex){
            PagesToPrint= (PrintPages/2)+ (PrintPages%2);
            System.out.println("Printing in duplex mode");
        }
        this.NumPagesPrinted=PagesToPrint;
        return PagesToPrint;
    }

    public int getNumPagesPrinted() {
        return NumPagesPrinted;
    }
}
