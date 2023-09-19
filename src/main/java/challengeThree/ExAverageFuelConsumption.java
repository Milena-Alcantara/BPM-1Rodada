package challengeThree;

import java.util.Scanner;

public class ExAverageFuelConsumption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a distância percorrida em Km: ");
        Integer distance = scanner.nextInt();
        System.out.println("Informe a quantidade em litros do combustível gasto: ");
        Double litersFuel = scanner.nextDouble();

        Double averageConsumption = distance / litersFuel;

        System.out.println("O valor médio de consumo é: " + String.format("%.3f", averageConsumption) + " Km/l");
    }
}
