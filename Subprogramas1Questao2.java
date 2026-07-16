package subprogramasLista1;
import java.util.Scanner;

public class Subprogramas1Questao2 {
	public static double media(double nota1, double nota2, double nota3, String tipo) {
		double media = 0;
		if(tipo.equalsIgnoreCase("A")) {
			media = (nota1 + nota2 + nota3) / 3;
		}
		else
			if(tipo.equalsIgnoreCase("P")) {
				media = (((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) / 10);
			}
		return media;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insira a nota 1: ");
		double nota1 = s.nextInt();
		System.out.println("Insira a nota 2: ");
		double nota2 = s.nextInt();
		System.out.println("Insira a nota 3: ");
		double nota3 = s.nextInt();
		System.out.println("Qual o tipo de média? [A] aritimética ou [P] ponderada");
		String tipo = s.next();
		String extenso = "";
		
		if(!tipo.equalsIgnoreCase("A") && !tipo.equalsIgnoreCase("P")) {
			System.out.println("Tipo incorreto, insira novamente: ");
			tipo = s.next();
		}
		
		if(tipo.equalsIgnoreCase("A")) {
			extenso = "aritimética";
		}
		else
			if(tipo.equalsIgnoreCase("P")) {
				extenso = "ponderada";
			}
		
		media(nota1, nota2, nota3, tipo);
		
		System.out.println("O tipo de média escolhida foi: " + extenso + ", e a média final ficou: " + media(nota1, nota2, nota3, tipo));
	}
}
