package diamondwithname;

public class Main {

    public static void main(String[] args) {
        int number = 10;

        for (int i = 0; i < number - 1; i++) {

            for (int j = number; j > i + 1; j--) {
                System.out.print(" ");
            }

            int base = 2 * i + 1;
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Manu");

        for (int i = number - 1; i > 0; i--) {

            for (int j = number + 1; j > i + 1; j--) {
                System.out.print(" ");
            }

            int base = 2 * i - 1;
            for (int j = base; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
