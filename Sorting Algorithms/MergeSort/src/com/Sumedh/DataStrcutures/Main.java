package com.Sumedh.DataStrcutures;

public class Main {

    public static void main(String[] args) {
        int[] array={20,35,-15,7,55,1,-22};
        mergeSort(array,0,array.length);

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static void mergeSort(int[] array,int start, int end){
        if((end-start)<2)   {
            return;
        }

        int mid= (start+end)/2;
        mergeSort(array,start,mid);//This call handles the left partition first completely
        mergeSort(array,mid,end);
        mergeAscending(array,start,mid,end);
    }

    public static void mergeAscending(int[]array,int start, int mid,int end){

//        if(array[mid-1]<=array[mid])
        if(array[mid-1]<=array[mid]){ //Optimization technique to reduce needless copying
            return;
        }
        int i=start;
        int j=mid;
        int tempIndex=0;

        int[] temp= new int[end-start];
        while(i<mid && j< end){
            temp[tempIndex++]= array[i]<=array[j] ? array[i++]: array[j++];

        }
        System.arraycopy(array,i,array,start+tempIndex, mid-i); //Second optimization
        System.arraycopy(temp,0,array,start,tempIndex);

    }
//    public static void mergeSort(int[] array,int start, int end){
//        if((end-start)<2){
//            return;
//        }
//
//        int mid= (end+start)/2;
//        mergeSort(array,start,mid);
//        mergeSort(array,mid,end);
//        MergeDescending(array,start,mid,end);
//    }
//
//    public static void MergeDescending(int[]array,int start, int mid,int end){
//        if(array[mid-1]>=array[mid]){
//            return;
//        }
//        int i=start;
//        int j=end;
//        int TempIndex=0;
//
//        int[] temp= new int[end-start];
//
//        while(i<mid && j<end){
//            temp[++TempIndex]= array[i]>= array[j] ? array[i++] :array[j++];
//        }
//        System.arraycopy(array,i,array,start+TempIndex,mid-i );
//        System.arraycopy(temp,0,array,start,TempIndex);
//    }

}
