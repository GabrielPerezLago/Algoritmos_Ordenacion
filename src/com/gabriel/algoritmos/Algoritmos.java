package com.gabriel.algoritmos;

import java.sql.SQLSyntaxErrorException;

public class Algoritmos extends Thread {
    public int n;
    public int[] arr;

    public Algoritmos(int n, int[] arr) {
        this.n = n;
        this.arr = arr;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            System.out.println("Bubble sort una vuelta");
        }
        System.out.println("Bubble sort ordenado");
    }

    @Override
    public void run() {
        switch(n){
            case 1: bubbleSort(arr);
                break;
            case 2: selectionSort(arr);
                break;
            case 3: insertionSort(arr);
                break;
        }
    }



    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            System.out.println("Selection sort una vuelta");
        }
        System.out.println("Selection sort ordenado");
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int clave = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > clave) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = clave;
            System.out.println("Insertion sort una vuelta");
        }
        System.out.println("Insertion sort ordenado");
    }
}
