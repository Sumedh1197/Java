package com.Sumedh.DataStrcutures;

public class Main {

    public static void main(String[] args) {
        String[] array= {"abcd","fghi","iopq","pqwe","kljm"};
        RadixSort(array,26,4);

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }
    public static void RadixSort(String[] array, int radix, int width){
        for(int i=width-1;i>=0;i--){
            RadixSingleSort(array,i,radix);
        }
    }
    public static void RadixSingleSort(String[] array,int position, int radix){
            int numStrings= array.length;
            int[] CountArray= new int[radix];

            for(String value:array){
                CountArray[getAlphabet(value, position)]++;
            }

            //SET UP COUNT ARRAY FOR STABLE SORT
            for(int i=1;i<radix;i++){
                    CountArray[i]+= CountArray[i-1];
            }

        String[] temp= new String[numStrings];
        for(int index=numStrings-1;index>=0;index--){
            temp[--CountArray[getAlphabet(array[index],position)]]= array[index];
        }
        for(int i=0;i<numStrings;i++){
            array[i]=temp[i];
        }

    }
    public static int getAlphabet(String array, int position ){
        return array.charAt(position)-'a';
    }
}
