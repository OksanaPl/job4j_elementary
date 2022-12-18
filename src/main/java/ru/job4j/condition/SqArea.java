package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double rsl1 = k + 1;
        double rsl2 = 2 * rsl1;
        double h = p / rsl2;
        double l = h * k;

        return l * h;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
