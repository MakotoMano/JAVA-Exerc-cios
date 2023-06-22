import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);
		double tempAr, umidAr, velVento, umidSolo;
		double resAero, eto;
		
		System.out.print("Umidade do Solo, em porcentagem (0 - 100): ");
		umidSolo = teclado.nextDouble();
		
		if (umidSolo > 0 && umidSolo < 50) {
			
			System.out.println("O solo está seco e necessita de irrigação");
						
			System.out.print("Temperatura Média do Ar, em graus celsius (precisa ser maior que 32): ");
			tempAr = teclado.nextDouble();
			
			System.out.print("Velocidade Média do Vento, em metros por segundo: ");
			velVento = teclado.nextDouble();
			
			System.out.print("Umidade Relativa do Ar, em porcentagem (0 - 100): ");
			umidAr = teclado.nextDouble();
			
			if (umidAr < 0 || umidAr > 100) {
				System.out.println("Valor incompatível, digite um valor entre 0 e 100");
			} 
			
			else {
						
				resAero = 37.6 * Math.pow(velVento, 1.0/0.16);
			
				eto = (0.0009384 * (tempAr + 17.8) * Math.sqrt(tempAr - 32) * resAero + 1.17 * (tempAr + 17.8) * umidAr / 100 * 6.5) / (tempAr + 237.3);

				System.out.println("Valor de eto: " + eto);
				
				if (eto > 5) {
					System.out.println("Será iniciada uma irrigação de 30 minutos");
				} 
				else if (eto > 2 && eto <=5) {
					System.out.println("Será iniciada uma irrigação de 15 minutos");
				}
				else if (eto <= 2) {
					System.out.println("A irrigação não será realizada");
				}
				
			}		
			
		} 
		else if (umidSolo >= 50 && umidSolo <= 100) {
			System.out.println("O solo está úmido e não necessita de irrigação");
		}
		else {
			System.out.println("Valores incompatíveis, digite valores entre 0 e 100");
		}
		
		
	}

}
