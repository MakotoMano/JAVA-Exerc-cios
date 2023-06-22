import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tipo de solo (argiloso ou arenoso): ");
        String tipoSolo = scanner.nextLine();

        System.out.print("Digite o tipo de clima (quente ou frio): ");
        String tipoClima = scanner.nextLine();

        System.out.print("Digite o tamanho da propriedade em hectares: ");
        int tamanhoPropriedade = scanner.nextInt();

        System.out.println("\nRecomendações de cultivos:");

        if (tipoSolo.equalsIgnoreCase("argiloso")) {
            System.out.println("- Cultivo de milho");
            System.out.println("- Cultivo de feijão");
            System.out.println("- Cultivo de soja");
        } else if (tipoSolo.equalsIgnoreCase("arenoso")) {
            System.out.println("- Cultivo de trigo");
            System.out.println("- Cultivo de cevada");
        }

        if (tipoClima.equalsIgnoreCase("quente")) {
            System.out.println("- Cultivo de tomate");
            System.out.println("- Cultivo de pimentão");
        } else if (tipoClima.equalsIgnoreCase("frio")) {
            System.out.println("- Cultivo de cenoura");
            System.out.println("- Cultivo de beterraba");
        }

        if (tamanhoPropriedade > 10) {
            System.out.println("- Cultivo de abóbora");
            System.out.println("- Cultivo de melancia");
        }

        scanner.close();
    }
}