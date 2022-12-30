package ru.job4j.arrray;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        int use = array[1];
        array[1] = array[2];
        array[2] = use;
        int arr = array[3];
        array[3] = array[4];
        array[4] = arr;

        for (int j : array) {
            System.out.println(j);
        }
    }
}
