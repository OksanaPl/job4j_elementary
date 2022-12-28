package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double dutyBalance = 0;
        while (amount > dutyBalance) {
            amount += (amount * (percent / 100) - salary);
            year++;
        }
        System.out.println(year);
        return year;
    }
}
