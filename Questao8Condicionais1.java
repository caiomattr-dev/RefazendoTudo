package condicionaisLista1;
import java.util.Scanner;

public class Questao8Condicionais1 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Insira suas 4 notas: ");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		int n4 = s.nextInt();
		double m = (n1 + n2 + n3 + n4) / 4;
		double nM = 0;
		
		if(m >= 7) {
			System.out.println("Aprovado com a média: " + m);
		}
		if(m < 7) {
			System.out.println("Insira a nota do exame: ");
			int ex = s.nextInt();
			nM = (m + ex) / 2;
		}
		if(nM >= 5)
			System.out.println("Parabems pasou com a média: " + nM);
		if(nM < 5)
			System.out.println("Reprovou com a média: " + nM);
	}
}
