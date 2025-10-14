package com.gabriel.algoritmos;

import com.gabriel.orden.Final;

public class SelectionSort extends Thread {
    public int[] arr;
    public Final f;

    public SelectionSort(int[] arr,  Final f) {
        this.arr = arr;
        this.f = f;
    }

    public void run() {
        String name = "Selection sort";
        try {
            selectionSort(arr);
            f.setAlg(name);
        } catch (Exception ex) {
            ex.printStackTrace();
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
}
