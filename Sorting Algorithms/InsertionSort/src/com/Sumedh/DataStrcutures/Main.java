package com.Sumedh.DataStrcutures;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("IMPLEMENTING INSERTION SORT ");
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

        System.out.println("Recursion: \n" )  ;
        InsertionRecursion(array,array.length);


    }
    public static void Ascending(int[] array){
        for(int firstUnsortedIndex=1;firstUnsortedIndex<array.length;firstUnsortedIndex++){
            int newElement= array[firstUnsortedIndex];
            int i;
            for(i=firstUnsortedIndex;i>0&&array[i-1]>newElement;i--){
                array[i]=array[i-1];
            }
            array[i]= newElement;
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void Descending(int[] array){
        for(int firstUnsortedIndex=1;firstUnsortedIndex<array.length;firstUnsortedIndex++){
            int newElement= array[firstUnsortedIndex];
            int i;
            for(i=firstUnsortedIndex;i>0&&array[i-1]<newElement;i--){
                array[i]=array[i-1];
            }
            array[i]= newElement;
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static void InsertionRecursion(int[] array, int numElements){
        if(numElements<2){
            return;
        }

        InsertionRecursion(array,numElements-1);

        int NewElement= array[numElements-1];
        int i;
        for( i=numElements-1; i>0 && array[i-1]>NewElement;i--){
            array[i]= array[i-1];
        }
        array[i]= NewElement;
        System.out.println("Result when number of elements is: " +numElements);
        for(i=0;i<array.length;i++){
            System.out.print(array[i]);
            System.out.print(",");
        }
        System.out.println("");
        System.out.println("==================================");
    }

}
