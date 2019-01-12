package lv.sdacademy;


public class PrimeNumber {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number/2 + 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
