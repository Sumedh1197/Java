package com.Sumedh.DataStrcutures;

public class Main {

    public static void main(String[] args) {
        int[] array={50,40,30,70,60};
        Ascending(array);
    }
    public static void Ascending(int[] array){
        for(int gap= array.length/2;gap>0;gap=gap/2){

            for(int i=gap;i<array.length-1;i++){
                if(array[i]>array[i+1]){
                    swap(array,i,i+1);
                }
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }
    public static void swap(int[] array,int i,int j){
        int temp= array[i];
        array[i]= array[j];
        array[j]=temp;
    }
}
