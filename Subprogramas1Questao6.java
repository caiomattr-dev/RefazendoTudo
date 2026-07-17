package subprogramasLista1;
import java.util.Scanner;

public class Subprogramas1Questao6 {
	public static void transforma(int a, int b, int c) {
		int dias = 0;
		if(a >= 1) {
			dias += a * 365;
		}
		if(b >= 1) {
				dias += b * 30;
			}
		if(c >= 1) {
				dias += c;
			}
		System.out.println("Dias totais: " + dias);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insira sua idade em anos: ");
		int anos = s.nextInt();
		System.out.println("Insira sua idade em meses: ");
		int meses = s.nextInt();
		System.out.println("Insira sua idade em dias: ");
		int dias = s.nextInt();
		
		transforma(anos, meses, dias);
	}
}
