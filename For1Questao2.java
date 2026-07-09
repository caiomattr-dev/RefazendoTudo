package forDoLista1;
import java.util.Scanner;

public class For1Questao2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int contador = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println("Insira um número: ");
			int num = s.nextInt();
			
			if(num < 0) {
				contador++;
			}
			System.out.println("");
		}
		System.out.println("Qntd de negativos: " + contador);
	}
}
