package subprogramasLista1;
import java.util.Scanner;

public class Subprogramas1Questao7 {
	public static void categoria(int a) {
		if(a > 17) {
			System.out.println("Adulto");
		}
		else
			if(a >= 14 && a <= 17) {
				System.out.println("Juvenil B");
			}
			else
				if(a >= 11 && a <= 13) {
					System.out.println("Juvenil A");
				}
				else
					if(a >= 8 && a <= 10) {
						System.out.println("Infantil B");
					}
					else
						System.out.println("Infantil A");
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insira sua idade: ");
		int idade = s.nextInt();
		
		categoria(idade);
	}
}
