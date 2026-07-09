package forDoLista1;
import java.util.Scanner;

public class For1Questao3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int soma = 0;
		int neg = 0;
		int inter = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Insira um valor: ");
			int num = s.nextInt();
			soma += num;
			if(num < 0) {
				neg++;
			}
			if(num <= 50 && num >= 5) {
				inter++;
			}
		}
		double media = soma / 10;
		System.out.println("Média: " + media + ", negativos: " + neg + ", no intervalo: " + inter);
	}
}
