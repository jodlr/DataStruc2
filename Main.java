package com.tts;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        /* int sum = Arrays.stream(arr).sum();
        System.out.println("The Sum is: "+sum); */
        toPower(4, 2);
    }

    public static int[] toPower(int size, int power) {

        int[] arr = new int[size];
        Arrays.fill(arr, 0);

        for (int i=0;i<size;i++){
            arr[i] = (int) Math.pow(i, power);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}







