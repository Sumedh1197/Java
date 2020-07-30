package com.Sumedh.DataStrcutures;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("IMPLEMENTING SELECTION SORT ");
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
    public static void swap(int[] array, int i, int j){
        if(i==j){
            return;
        }
        int temp= array[i];
        array[i]= array[j];
        array[j]= temp;

    }
    public static void Ascending(int[] array){

        for(int LastUnsortedIndex= array.length-1;LastUnsortedIndex>0;LastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= LastUnsortedIndex; i++) {
                if (array[i] > array[largest]) {
                    largest=i;
                }
            }
            swap(array, largest, LastUnsortedIndex);
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void Descending(int[] array){

        for(int LastUnsortedIndex= array.length-1;LastUnsortedIndex>0;LastUnsortedIndex--) {
            int smallest = 0;
            for (int i = 1; i <= LastUnsortedIndex; i++) {
                if (array[i] < array[smallest]) {
                    smallest=i;
                }
            }
            swap(array, smallest, LastUnsortedIndex);
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
