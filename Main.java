package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void print(int[] a,String title){
        System.out.print(title+" ");
        for(int i : a)//это цикл foreach
            System.out.print(i+" ");

        System.out.println();
    }
    public static void fill_random(int[] a){
        int max = 100,min = 10;
        Random r = new Random();
        for(int i = 0;i < a.length;i++)
            a[i] = r.nextInt(max - min + 1) + min;

    }
    public static void sort(int[] a){
        for(int i = 1;i < a.length;i++){
            int j = i;
            while((j>=1)&&(a[i] <= a[j-1]))
                j--;

            if(i != j){
                int ai = a[i];
                for (int k = i; k >= j+1; k--)
                    a[k] = a[k - 1];

                a[j] = ai;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        fill_random(arr);
        print(arr,"In:");
        sort(arr);
        print(arr,"Out:");
    }
}