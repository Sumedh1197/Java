package com.Sumedh.DataStrcutures;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr= {1425,6789,9032,4512,2349,7643,1290};
//        Arrays.parallelSort(arr);
        RadixSort(arr,10,4);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    public static void RadixSort(int[] array, int radix, int width){
        for(int i=0;i<width;i++){
            RadixSingleSort(array,i,radix);
        }
    }
    public static void RadixSingleSort(int[]array,int position,int radix){
        int numElements= array.length;
        int[] CountArray= new int[radix];

        for(int value:array){
            CountArray[getDigit(position,value,radix)]++;
        }

        //Setting up count array for stable sort
        for(int j=1;j<radix;j++){
            CountArray[j]+= CountArray[j-1];
        }

        int[] temp= new int[numElements];
        for(int index=numElements-1;index>=0;index--){
            temp[--CountArray[getDigit(position,array[index],radix)]]= array[index];
        }

        for(int i=0;i<numElements;i++){
            array[i]=temp[i];
        }
    }
    public static int getDigit(int position,int value, int radix){
        return value/(int) Math.pow(10,position) % radix;
    }
}
