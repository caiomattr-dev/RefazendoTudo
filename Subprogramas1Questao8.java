package subprogramasLista1;
import java.util.Scanner;

public class Subprogramas1Questao8 {
	public static boolean confere(int a) {
		if(a > 0) {
			return true;
		}
		else
			return false;
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe um número positivo ou negativo: ");
		int num = s.nextInt();
		
		confere(num);
		System.out.println(confere(num));
	}
}
