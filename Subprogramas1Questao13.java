package subprogramasLista1;

import java.util.Scanner;

public class Subprogramas1Questao13 {
	public static int fatorial(int num) {
		int fatorial = 0;
		int aux = num - 1;
		
		if(num == 0) {
			return 1;
		}
		else
			while(aux > 0) {
				fatorial = num * aux;
				num = fatorial;
				aux--;
			}
		return fatorial;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe um valor inteiro e positivo: ");
		int num = s.nextInt();
		boolean confere = true;
		if(num < 0) {
			confere = false;
			while(!confere) {
				System.out.println("Número inválido, insira novamente: ");
				num = s.nextInt();
				if(num >= 0) {
					confere = true;
				}
			}
		}
		fatorial(num);
		System.out.println("O fatorial de: " + num + " é " + fatorial(num));
	}
}
