package whileLista1;
import java.util.Scanner;

public class While1Questao6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String continuar = "S";
		while(!continuar.equalsIgnoreCase("N")) {
			int contador = 0;
			int impares = 1;
			System.out.println("Escolha um número para achar sua raíz quadrada");
			int num = s.nextInt();
			if(num < 0) {
				System.out.println("Número inválido, insira outro:");
				num = s.nextInt();
			}
			while(num > 0) {
				num = num - impares;
				impares = impares + 2;
				contador++;
				if(num == 0) {
					System.out.println("Raíz exata: " + contador);
				}
				if(num < 0) {
					System.out.println("Raíz aproximada: " + contador);
				}
			}
			System.out.println("Deseja fazer outro número? ");
			continuar = s.next();
		}
		System.out.println("Fim do programa. ");
	}
}
