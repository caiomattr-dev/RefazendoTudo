package forDoLista1;
import java.util.Scanner;

public class For1Questao4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int soma = 0;
		int valorMaior = 0;
		int valorMenor = 100000000;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Insira número: ");
			int num = s.nextInt();
			
			if(num > valorMaior) {
				valorMaior = num;
			}
			if(num < valorMenor) {
				valorMenor = num;
			}
			soma += num;
		}
		double media = soma / 10;
		System.out.println("Média: " + media + ", maior valor: " + valorMaior + ", menor valor: " + valorMenor);
	}
}
