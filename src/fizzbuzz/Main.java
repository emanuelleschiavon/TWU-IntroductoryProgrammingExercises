package fizzbuzz;

public class Main {
    public static void main(String[] args) {
        int number = 100;

        for (int i = 1; i <= number; i++) {
            boolean isDivisibleThree = i % 3 == 0;
            boolean isDivisibleFive = i % 5 == 0;

            if (isDivisibleThree && isDivisibleFive) {
                System.out.println("FizzBuzz");
            } else if (isDivisibleThree) {
                System.out.println("Fizz");
            } else if (isDivisibleFive) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
