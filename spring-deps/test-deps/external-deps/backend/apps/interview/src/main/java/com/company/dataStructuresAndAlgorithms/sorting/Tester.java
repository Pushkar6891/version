package com.company.dataStructuresAndAlgorithms.sorting;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        Tester obj = new Tester();
        System.out.println("Original Array");
        System.out.println(Arrays.toString(new int[]{0, -1, 3, 4, 9, 6}));
        System.out.println("Bubble Sort");
        System.out.println(Arrays.toString(obj.bubbleSort(new int[]{6, 4, -1, 3, 9, 0})));
        System.out.println("Insertion Sort");
        System.out.println(Arrays.toString(obj.insertionSort(new int[]{3, 4, -1, 9, 0, 6})));
        System.out.println("Selection Sort");
        System.out.println(Arrays.toString(obj.selectionSort(new int[]{6, 4, -1, 3, 9, 0})));
        System.out.println("Merge Sort");
        System.out.println(Arrays.toString(obj.mergeSort(new int[]{-1, 6, 3, 4, 0, 9})));
    }

    public int[] bubbleSort(int[] arr) {
        int n = arr.length;
        boolean isSwapped = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
        return arr;
    }

    public int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    public int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public int[] mergeSort(int[] arr) {
        mergeSortImpl(arr, new int[arr.length], 0, arr.length - 1);
        return arr;
    }

    public void mergeSortImpl(int[] arr, int[] temp, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSortImpl(arr, temp, low, mid);
            mergeSortImpl(arr, temp, mid + 1, high);
            merge(arr, temp, low, mid, high);
        }
    }

    private void merge(int[] arr, int[] temp, int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }

        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {
            if (temp[i] < temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            arr[k] = temp[i];
            k++;
            i++;
        }
    }
}
