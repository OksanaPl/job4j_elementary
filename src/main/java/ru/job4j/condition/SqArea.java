package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double rsl1 = k + 1;
        double rsl2 = 2 * rsl1;
        double h = p / rsl2;

        double l = h * k;

        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 4, k = 1, s = 2, real = " + result1);
    }
}
