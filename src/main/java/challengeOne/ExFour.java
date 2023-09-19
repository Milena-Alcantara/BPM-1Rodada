package challengeOne;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        do {
            try {
                System.out.print("Digite a nota do aluno entre 0 a 10: ");
                int note = scanner.nextInt();

                if (note >= 8 && note <= 10) {
                    System.out.println("Aprovado!");
                } else if (note >= 6 && note < 8) {
                    System.out.println("Recuperação!");
                } else if (note < 6 && note >= 0) {
                    System.out.println("Reprovado!");
                } else {
                    System.out.println("Nota inválida");
                }
            } catch (InputMismatchException err) {
                System.err.println("Por favor, digite somente números inteiros.");
                repeat = false;
            }
        } while (repeat);

    }
}
