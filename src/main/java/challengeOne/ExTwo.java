package challengeOne;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        do {
            try {
                System.out.println("Infome o número desejado: ");
                int number = scanner.nextInt();

                if (number >= 0) {
                    System.out.println("O número " + number + " é positivo.");
                } else {
                    System.out.println("O número " + number + " é negativo.");
                }

            } catch (InputMismatchException err) {
                System.err.println("Por favor, digite somente números inteiros.");
                repeat = false;
            }
        } while (repeat);


    }
}
