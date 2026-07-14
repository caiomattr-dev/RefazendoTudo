package whileLista1;
import java.util.Scanner;

public class While1Questao13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double paisA = 5000000;
		double paisB = 7000000;
		int anos = 0;
		
		while(paisA < paisB) {
			paisA = paisA + (paisA * 0.03);
			paisB = paisB + (paisB * 0.02);
			anos++;
		}
		System.out.println("Demoraram: " + anos + " anos para o país A ultrapassar o país B.");
	}
}
