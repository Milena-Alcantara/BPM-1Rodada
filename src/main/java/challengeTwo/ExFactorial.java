package challengeTwo;

import java.util.Scanner;

public class ExFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor que desja calcular o fatorial: ");
        int valueToBeFactored = scanner.nextInt();

        Long factoredValue = (long) valueToBeFactored;

        if (valueToBeFactored == 0) {
            factoredValue = 1l;
            System.out.println("O valor fatorial do número digitado é: " + factoredValue);

        } else if (valueToBeFactored < 0) {
            System.out.println("Não é possível calcular o valor fatorial de um número negativo.");

        } else if (valueToBeFactored < 13) {
            while (valueToBeFactored > 1) {
                factoredValue = factoredValue * (valueToBeFactored - 1);
                valueToBeFactored--;
            }
            System.out.println("O valor fatorial do número digitado é: " + factoredValue);
        } else {
            System.out.println("Não é possível calcular o fatorial deste número.");
        }
    }
}
