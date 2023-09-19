package challengeOne;

import java.util.Scanner;

public class ExThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a letra que deseja verificar: ");
        String letter = scanner.next();

        String regex = "^[a-zA-Z]+$";
        if (!letter.matches(regex)) {
            System.out.println("Não é possível verificar valores diferentes de letras. ");
        } else if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") ||
                letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") ||
                letter.equalsIgnoreCase("u")) {
            System.out.println("A letra " + letter + " é uma vogal.");

        } else {
            System.out.println("A letra " + letter + " é uma consoante.");

        }
    }
}
