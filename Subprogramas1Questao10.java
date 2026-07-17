package subprogramasLista1;
import java.util.Scanner;

public class Subprogramas1Questao10 {
	public static void conceito(double a) {
		if(a >= 9) {
			System.out.println("Conceito: A");
		}
		else 
			if(a >= 7 && a < 9) {
				System.out.println("Conceito: B");
			}
			else 
				if(a >= 5 && a < 7) {
					System.out.println("Conceito: C");
				}
				else
					System.out.println("Conceito: D");
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe sua média final: ");
		double nota = s.nextDouble();
		boolean confere = true;
		
		if(nota < 0 || nota > 10) {
			confere = false;
			while(!confere) {
				System.out.println("Número inválido, insira novamente: ");
				nota = s.nextDouble();
				if(nota >= 0 && nota <= 10) {
					confere = true;
				}
			}
		}
		conceito(nota);
	}
}
