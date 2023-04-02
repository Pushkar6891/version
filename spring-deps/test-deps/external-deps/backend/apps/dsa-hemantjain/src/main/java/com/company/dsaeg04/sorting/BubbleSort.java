package com.company.dsaeg04.sorting;

public class BubbleSort {
    private boolean less(int value1, int value2) {
        return value1 < value2;
    }

    private boolean greater(int value1, int value2) {
        return value1 > value2;
    }

    public void sort(int[] arr) {
        int size = arr.length;
        int i, j, temp;
        for (i = 0; i < (size - 1); i++) {
            for (j = 0; j < size - i - 1; j++) {
                if (greater(arr[j], arr[j + 1])) {
                    /* Swapping */
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void sort2(int[] arr) {
        if (arr == null || arr.length == 0)
            return;

        boolean isSwapped;
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                //check the adjacent elements
                if (arr[j] > arr[j + 1]) {
                    //swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            //check if any swapping occurred in last iteration
            //if yes then break the loop, array is sorted at this point
            if (isSwapped == false)
                break;
        }

    }

    public static void main(String[] args) {
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        BubbleSort b = new BubbleSort();
        b.sort(array);
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
        int[] array2 = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        b = new BubbleSort();
        b.sort2(array2);
        for (int j : array2) {
            System.out.print(j + " ");
        }
    }
}
/*
1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9
*/
