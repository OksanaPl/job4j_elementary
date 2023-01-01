package ru.job4j.arrray;

public class Turn {
    public static int[] back(int[] array) {

        if (array.length % 2 == 0) {
            for (int i = 0; i < array.length / 2; i++) {
                int use = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = use;
            }
        } else {
            for (int i = 0; i < (array.length - 1) / 2; i++) {
                int use = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = use;
            }
        }
        return array;
    }
}