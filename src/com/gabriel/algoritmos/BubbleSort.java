package com.gabriel.algoritmos;

public class BubbleSort extends Thread {
    public int[] arr;

    public BubbleSort(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        bubbleSort(arr);
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
}
