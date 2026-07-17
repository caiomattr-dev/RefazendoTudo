package subprogramasLista1;

import java.util.Scanner;

public class Subprogramas1Questao14 {
	public static void tabuada(int num) {
		int tabuada = 1;
		while(tabuada <= num) {
			System.out.println(tabuada + " x " + num + " = " + (tabuada * num));
			tabuada++;
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe um número qualquer ");
		int num = s.nextInt();
		
		tabuada(num);
	}
}
