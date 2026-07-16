package subprogramasLista1;
import java.util.Scanner;

public class Subprogramas1Questao4 {
	public static double bhaskara(int a, int b, int c) {
		double delta = Math.sqrt((Math.pow(b, 2) - (4 * a * c)));
		double raiz1 = 0;
		double raiz2 = 0;
		
		if(delta == 0) {
			raiz1 = (-b + delta) / (2 * a);
			raiz2 = (-b - delta) / (2 * a);
		}
		else
			if(delta > 0) {
				raiz1 = (-b + delta) / (2 * a);
				raiz2 = (-b - delta) / (2 * a);
			}
		
		return raiz1 + raiz2;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insira o valor de a: ");
		int a = s.nextInt();
		System.out.println("Insira o valor de b: ");
		int b = s.nextInt();
		System.out.println("Insira o valor de c: ");
		int c = s.nextInt();
		
		System.out.println("A soma das raízes é: " + bhaskara(a, b ,c));
	}
}
