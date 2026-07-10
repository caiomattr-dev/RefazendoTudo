package forDoLista2;
import java.util.Scanner;

public class For2Questao1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int soma = 0;
		int neg = 0;
		int inter = 0;
		int maiorV = 0;
		int menorV = 51;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Insira um valor: ");
			int num = s.nextInt();
			if(num > 50) {
				System.out.println("Valor inválido. Insira outro: ");
				num = s.nextInt();
			}
			soma += num;
			if(num < 0) {
				neg++;
			}
			if(num <= 50 && num >= 5) {
				inter++;
			}
			if(num > maiorV) {
				maiorV = num;
			}
			if(num < menorV) {
				menorV = num;
			}
		}
		double media = soma / 10;
		System.out.println("Média: " + media + ", negativos: " + neg + ", no intervalo: " + inter + ", maior valor: " + maiorV + ", menor valor: " + menorV);	
	}
}
