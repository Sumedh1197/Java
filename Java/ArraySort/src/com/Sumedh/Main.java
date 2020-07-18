package com.Sumedh;

import java.util.Scanner;

public class Main {
    Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray= getIntegers(5);
        int[] sorted= sortArray(myArray);
        printArray(sorted);
    }

    public static int[] getIntegers(int length){
        Scanner scanner= new Scanner(System.in);
        int[] values= new int[length];
        for(int i=0;i<values.length;i++){
            values[i]= scanner.nextInt();
        }
        return values;
    }
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Element entered at " +i +" is: " +array[i]);
        }
    }
    public static  int[] sortArray(int [] array){
        int[] sortedArray= new int[array.length];
        for(int i=0;i<array.length;i++){
            sortedArray[i]=array[i];
        }
        boolean flag= true;
        int temp;
        while(flag){
            flag=false;
            for(int i=0;i<sortedArray.length-1;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp= sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                }
            }
        }
        return sortedArray;
    }
}
