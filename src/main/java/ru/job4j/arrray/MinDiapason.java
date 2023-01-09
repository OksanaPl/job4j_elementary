package ru.job4j.arrray;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            if (array[start] > array[i]) {
                array[start] = array[i];
                min = array[i];
            }
        }
        return min;
    }
}
