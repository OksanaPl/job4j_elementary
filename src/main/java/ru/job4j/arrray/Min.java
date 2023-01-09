package ru.job4j.arrray;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[0] > array[i]) {
                array[0] = array[i];
                min = array[0];
            }
        }
        return min;
    }
}
