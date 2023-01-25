package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minusAndDivision(double first, double second) {
        return minus(first, second)
                + division(first, second);

    }

    public static double sumAll(double first, double second, double third, double fourth) {
        return sumAndMultiply(first, second)
        + minusAndDivision(third, fourth);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Сумма разности и деления равна: " + minusAndDivision(8, 4));
        System.out.println("Сумма всех операций: " + sumAll(10, 20, 8, 4));
    }
}
