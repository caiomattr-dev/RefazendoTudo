package forDoLista1;
import java.util.Scanner;

public class For1Questao1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Selecione uma tabuada: ");
		int t = s.nextInt();
		int conta = 0;
		
		for(int i = 1; i <= 10; i++) {
			conta = t * i;
			System.out.println(t + " x " + i + " = " + conta);
		}
	}
}
