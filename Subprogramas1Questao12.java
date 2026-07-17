package subprogramasLista1;

import java.util.Scanner;
	
public class Subprogramas1Questao12 {
	public static void tipoT(int l1, int l2, int l3) {
		if(l1 == l2 && l2 == l3) {
			System.out.println("O triângulo é Equilátero. ");
		}
		else
			if(l1 == l2 && l2 != l3 || l2 == l3 && l3 != l1 || l3 == l1 && l1 != l2) {
				System.out.println("O triângulo é Isósceles. ");
			}
			else
				System.out.println("O triângulo é Escaleno.");
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe os lados do triângulo: ");
		int l1 = s.nextInt();
		int l2= s.nextInt();
		int l3 = s.nextInt();
		boolean confere = true;
		
		if(l1 >= (l2 + l3)) {
			confere = false;
			while(!confere) {
				System.out.println("O lado 1 do triângulo é inválido, insira outro: ");
				l1 = s.nextInt();
				if(l1 < (l2 + l3)) {
					confere = true;
				}
			}
		}
		else
			if(l2 >= (l1 + l3) || l3 >= (l2 + l1)) {
				confere = false;
				while(!confere) {
					System.out.println("O lado 2 do triângulo é inválido, insira outro: ");
					l2 = s.nextInt();
					if(l2 < (l1 + l3)) {
						confere = true;
					}
				}
			}
			else
				if(l3 >= (l2 + l1)) {
					confere = false;
					while(!confere) {
						System.out.println("O lado 3 do triângulo é inválido, insira outro: ");
						l3 = s.nextInt();
						if(l3 < (l2 + l1)) {
							confere = true;
						}
					}
				}
		tipoT(l1, l2, l3);
		System.out.println("");
	}
}
