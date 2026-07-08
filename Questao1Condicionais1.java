package condicionaisLista1;
import java.util.Scanner;

public class Questao1Condicionais1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Informe um número");
		double num = s.nextInt();

		if(num % 10 == 0 && num % 5 == 0 && num % 2 == 0) {
			System.out.println("O número " + num + " é divisível por todos.");
		}
		else
			if(num % 2 == 0)
				System.out.println("O número " + num + " é divisível por 2.");
			else
				if(num % 5 == 0)
					System.out.println("O número " + num + " é divisível por 5.");
				else
					if(num % 10 == 0)
						System.out.println("O número " + num + " é divisível por 10.");
		
		if(num % 10 != 0 && num % 5 != 0 && num % 2 != 0)
			System.out.println("O número " + num + " não é divisível por ninguém.");
		
	}

}
