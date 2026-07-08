package condicionaisLista1;
import java.util.Scanner;

public class Questao7Condicionais1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Insira um número: ");
		int num = s.nextInt();
		if(num % 2 ==0)
			System.out.println("par");
		else
			System.out.println("ímpar");
	}
}
