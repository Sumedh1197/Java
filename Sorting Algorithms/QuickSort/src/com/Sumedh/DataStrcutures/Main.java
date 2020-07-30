package com.Sumedh.DataStrcutures;

public class Main {

    public static void main(String[] args) {
        int[] array={60,90,30,-20,-18,1};
        QuickSort(array,0,array.length);

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void QuickSort(int[] array, int start, int end){
        if(end-start<2){
            return;
        }

        int pivotIndex= partitionArray(array,start,end);
        QuickSort(array,start,pivotIndex);
        QuickSort(array,pivotIndex+1,end);
    }
    public static int partitionArray(int[] array, int start, int end){
        int pivotElement= array[start] ;
        int i=start;
        int j=end;

        while(i<j){
            //Empty loop without a body since we are keeping all elements greater in the right sub array
            while(i<j && array[--j]>= pivotElement);

            if(i<j){
                array[i]= array[j];
            }
            //Empty loop without a body since we are keeping all elements lesser than pivotElement
            // in the right sub array
            while(i<j && array[++i]<=pivotElement);

            if(i<j){
                array[j] = array[i];
            }
        }
        array[j]= pivotElement;
        return j;
    }
}
