package whileLista1;
import java.util.Scanner;

public class While1Questao9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Insira o primeiro termo: ");
		int a1 = s.nextInt();
		System.out.println("Insira o segundo termo: ");
		int a2 = s.nextInt();
		
		int aprox = 3;
		int cont = 1;
		int conta = 0;
		while(cont <=20) {
			if(aprox % 2 ==0) {
				conta = a2 - a1;
			}
			else
				if(aprox % 2 != 0) {
				conta = a2 + a1;
				}
			
			a1 = a2;
			a2 = conta;
			System.out.print(conta + " ");
			cont++;
			aprox++;
		}
	}
}
