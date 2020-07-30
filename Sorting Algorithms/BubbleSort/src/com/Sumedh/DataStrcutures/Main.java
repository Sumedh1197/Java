package com.Sumedh.DataStrcutures;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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
    public static void swap(int[] array,int i,int j){

        if(i==j){
            return;
        }
        int temp= array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    public static void Ascending(int[] array){
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

//        for(int lastUnSortedIndex= array.length-1;lastUnSortedIndex>0;lastUnSortedIndex--){
//            for(int i=0;i<lastUnSortedIndex;i++){
//                if(array[i]>array[i+1]){
//                    swap(array,i,i+1);
//                }
//            }
//        }
//        for(int i=0;i<array.length;i++){
//            System.out.println(array[i]);
//        }
    }
    public static void Descending(int[] array){
        for(int LastUnSortedIndex=array.length-1;LastUnSortedIndex>0;LastUnSortedIndex--){
            for(int i=0;i<LastUnSortedIndex;i++){
                if(array[i]<array[i+1]){
                    swap(array,i,i+1);
                }
            }
        }
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
