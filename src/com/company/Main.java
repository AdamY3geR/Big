package com.company;
public class Main {
    public static void main(String[] args){
        int[] arr = {1,2,7,4,4,5,5,5,6,6,7,4,7,0,4};
        System.out.println(big(arr));
    }
    public static int big(int[] arr){
        int bnum=0;
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>bnum) {
                bnum = arr[i];
                index=i;
            }
        }
        return index;
    }
}