package challengeOne;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExOne {
    public static void main(String[] args) {
        boolean repeat = true;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Informe o primeiro número: ");
                int numberOne = scanner.nextInt();
                System.out.println("Informe o primeiro número: ");
                int numberTwo = scanner.nextInt();

                int higherNumber = (numberOne > numberTwo) ? numberOne : numberTwo;
                System.out.println("O maior número é: " + higherNumber);
                repeat = false;

            } catch (InputMismatchException err) {
                System.err.println("Por favor, digite somente números inteiros.");
            }
        } while (repeat);

    }
}
