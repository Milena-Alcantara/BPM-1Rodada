package challengeOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Infome os cinco números desejados: ");
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= 4; i++) {
            numbers.add(scanner.nextInt());
        }
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Visualize seus números em ordem descrescente: ");

        for (int number : numbers) {
            System.out.print(" " + number);
        }
    }
}
