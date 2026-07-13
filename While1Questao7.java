package whileLista1;
import java.util.Scanner;

public class While1Questao7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um número de 4 dígitos: ");
		int num = s.nextInt();
		int conta = 0;
		int resto = 0;
		int junta = 0;
		
		while(num <= 9999 && num >= 1000) {
			conta = num / 100;
			resto = num % 100;
			junta = (conta + resto) * (conta + resto);
			if(junta == num) {
				System.out.println("O número tem a característica, visto que: " + num + ": " + conta + " + " + resto + " = " + (conta + resto) + " e " + (conta + resto) + "**2 = " + junta);
			}
			else
				System.out.println("O número " + num + " não possui a característica.");
			
			System.out.println("");
			System.out.println("Insira outro número: ");
			num = s.nextInt();
		}
		System.out.println("Número inválido, fim do programa. ");
	}
}
