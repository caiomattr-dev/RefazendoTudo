package whileLista1;
import java.util.Scanner;

public class While1Questao5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double precokWh = 0;
		double consumo = 0;
		double totalAPagar = 0;
		int contador = 0;
		
		double maiorConsumo = Integer.MIN_VALUE;
		double menorConsumo = Integer.MAX_VALUE;
		
		double totalR = 0;
		double totalC = 0;
		double totalI = 0;
		double mediaTotal = 0;
		
		System.out.println("Insira o número do consumidor: ");
		String numeroC = s.next();
		
		while(!numeroC.equalsIgnoreCase("X")) {
			int tipo = 0;
			System.out.println("Insira o preço do kWh: ");
			precokWh = s.nextDouble();
			System.out.println("Insira o consumo: ");
			consumo = s.nextDouble();
			System.out.println("Qual o seu tipo? [1] Residencial, [2] Comercial. [3] Industrial.");
			tipo = s.nextInt();
			if(tipo < 1 || tipo > 3) {
				System.out.println("tipo inválido, insira outro");
				tipo = s.nextInt();
			}
			totalAPagar = precokWh * consumo;
			
			if(tipo == 1) {
				totalR += totalAPagar;
			}
			else
				if(tipo == 2) {
					totalC += totalAPagar;
				}
				else
					if(tipo == 3) {
						totalI += totalAPagar;
					}
			if(consumo > maiorConsumo) {
				maiorConsumo = consumo;
			}
			if(consumo < menorConsumo) {
				menorConsumo = consumo;
			}
			contador++;
			mediaTotal += totalAPagar;
			System.out.println("O consumidor " + numeroC + " deve pagar: R$" + totalAPagar);
			System.out.println("");
			System.out.println("Insira outro número: [x para parar]");
			numeroC = s.next();
		}
		
		System.out.println("O maior consumo foi: " + maiorConsumo + "\nO menor consumo foi: " + menorConsumo);
		System.out.println("");
		System.out.println("O total para o tipo Residencial foi: " + totalR + "\nO total para o tipo Comercial foi: " + totalC + "\nO total para o tipo Industrial foi: " + totalI);
		System.out.println("A média geral de consumo foi: " + (mediaTotal / contador));
	}
}
