package com.Sumedh.DataStrcutures;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("IMPLEMENTING SHELL SORT ");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array:  ");
        int size= sc.nextInt();
        int array[]= new int[size];
        sc.nextLine();
        for(int i=0;i<size;i++){
            System.out.println("Enter element number " + (i+1) +"  : ");
            array[i]= sc.nextInt();
        }
        System.out.println(array.length);

        //Calling ascending method and printing
        System.out.println("Ascending output is: \n");
        Ascending(array);
        System.out.println("================================================================ \n");
        //Calling Descending and printing
        System.out.println("Descending output is: \n");
        Descending(array);
    }

    public static void Ascending(int[] array){
        for(int gap= array.length/2; gap>0;gap=gap/2){

            for(int i=gap;i<array.length;i++){
                int newElement= array[i];
                int j=i;


                while(j>=gap && array[j-gap]>newElement){
                    array[j] = array[j-gap];
                    j-=gap;
                }
                array[j]=newElement;
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void Descending(int[] array){
        for(int gap= array.length/2; gap>0;gap=gap/2){

            for(int i=gap;i<array.length;i++){
                int newElement= array[i];
                int j=i;


                while(j>=gap && array[j-gap]<newElement){
                    array[j] = array[j-gap];
                    j-=gap;
                }
                array[j]=newElement;
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
