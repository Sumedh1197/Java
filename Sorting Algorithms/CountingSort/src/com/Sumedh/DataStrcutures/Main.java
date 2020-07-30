package com.Sumedh.DataStrcutures;

public class Main {

    public static void main(String[] args) {
        int[]arr = {8,7,2,4,1,9,10,8,7,1};

        CountSort(arr,1,10);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void CountSort(int[] array, int min, int max){
        int[] countArray= new int[(max-min)+1];
        for(int i=0;i<array.length;i++){
            countArray[array[i]-min]++; //Setting up our count array by calculating the occurrence of each val
        }
        //for the above input countArray would be: {2,1,0,1,0,0,2,2,1,1}
        int j=0; //index we are using to write to the input array
        for(int i=min;i<=max;i++){
            while(countArray[i-min]>0){
                array[j++]=i;
                countArray[i-min]--; //Decrementing the value of that particular index in the countArray
            }
        }
    }
}
