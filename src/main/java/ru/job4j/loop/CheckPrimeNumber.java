package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int i = 2; i < number; i++) {
            if (isDividedByX(number, i)) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    private static boolean isDividedByX(int number, int x) {
        return number % x == 0;
    }
}
