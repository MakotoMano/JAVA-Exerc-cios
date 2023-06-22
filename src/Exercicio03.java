import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		int cont = 1, regiao, risco = 0;
		double precipitacao = 0, tempMedia = 0, consumoAgua = 0;
		
		System.out.print("Quantidade de regiões a serem analisadas: ");
		regiao = teclado.nextInt();
		
		if (regiao < 0) {
			System.out.println("Valor incompativel (menor que 0)");
		}
		
		while (cont <= regiao) {
		
			do {
				System.out.println("Os valores precisam ser maiores que 0 (exceto temperatura média)");
			
				System.out.print("Precipitação da região " + cont + " em milimetros: ");
				precipitacao = teclado.nextDouble();
				System.out.print("Temperatura média da região " + cont + " em graus celcius: ");
				tempMedia = teclado.nextDouble();
				System.out.print("Consumo de água da região " + cont + " em metros cúbicos: ");
				consumoAgua = teclado.nextDouble();
		
			} while (precipitacao < 0 || consumoAgua < 0);
		
			
			if (precipitacao >= 100) {
				System.out.println("Não há risco de seca na região " + cont);
			} 
			else if (precipitacao < 100 && tempMedia > 30 && consumoAgua > 500) {
				System.out.println("Há risco de seca na região " + cont);
				risco = risco +1;
	
			} else {
				System.out.println("Não há risco de seca na região");
			}
			
		cont = cont + 1;
			
	 }
			
		System.out.println(risco + " regiões possuem risco de ter seca no próximo período de estiagem");
			
  }
		
		
}


