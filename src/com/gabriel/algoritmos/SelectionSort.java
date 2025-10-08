package com.gabriel.algoritmos;

public class SelectionSort extends Thread {
    public int[] arr;

    public SelectionSort(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        selectionSort(arr);
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
}
