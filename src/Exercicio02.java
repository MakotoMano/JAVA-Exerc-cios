import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de indústrias de alimentos a serem processadas: ");
        int quantidadeIndustrias = scanner.nextInt();
        int contadorProblemas = 0;

        for (int i = 1; i <= quantidadeIndustrias; i++) {
            System.out.println("\nIndústria " + i + ":");
            System.out.print("Digite o valor do pH da água: ");
            double ph = scanner.nextDouble();

            System.out.print("Digite o valor do índice de cloro da água: ");
            double indiceCloro = scanner.nextDouble();

            if (ph < 6.5 || ph > 8.5 || indiceCloro < 0.5 || indiceCloro > 2.0) {
                System.out.println("Água imprópria para fabricação de alimentos.");
                contadorProblemas++;
            } else {
                System.out.println("Água própria para fabricação de alimentos.");
            }
        }

        double porcentagemProblemas = (contadorProblemas / (double) quantidadeIndustrias) * 100;
        System.out.println("\nPorcentagem de indústrias com problemas na água: " + porcentagemProblemas + "%");

        scanner.close();
    }
}
