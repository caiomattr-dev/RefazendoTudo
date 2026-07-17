package subprogramasLista1;
import java.util.Scanner;

public class Subprogramas1Questao9 {
	public static boolean confere(int a) {
		if(a % 2 == 0) {
			return true;
		}
		else
			return false;
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int num = s.nextInt();
		
		confere(num);
		System.out.println(confere(num));
	}
}
