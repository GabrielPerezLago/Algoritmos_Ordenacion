package com.gabriel.algoritmos;

public class InsertionSort extends Thread {
    public int[]  arr;

    public InsertionSort(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        insertionSort(arr);
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
