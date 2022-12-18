package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double po = a + b + c;
        double p = po / 2;
        double rsl1 = p - a;
        double rsl2 = p - b;
        double rsl3 = p - c;
        double rsl4 = rsl1 * rsl2 * rsl3;
        double rsl5 = rsl4 * p;
        return Math.sqrt(rsl5);
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
