package primefactors;

public class Main {

    public static void main(String[] args) {
        generate(121);
    }

    public static void generate(int n) {
        for (int i = 2; i <= n; i++) {
            boolean isDivisible = n % i == 0;

            if (isDivisible && isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
