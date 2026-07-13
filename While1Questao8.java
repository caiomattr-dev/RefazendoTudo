package whileLista1;
import java.util.Scanner;

public class While1Questao8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = 0;
		int aa = 1;
		int aaa = 1;
		System.out.println("Escolha um número para a série de fibonacci");
		int num = s.nextInt();
		
		System.out.print(aa + " ");
		System.out.print(aaa + " ");
		
		while(a < num) {
			a = aaa + aa;
			System.out.print(a + " ");
			aaa = aa;
			aa = a;
		}
	}
}
