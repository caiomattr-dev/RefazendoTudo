package condicionaisLista2;
import java.util.Scanner;

public class Questao2Condicionais2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insira sua idade: ");
		int idade = s.nextInt();
		if(idade == 1)
			System.out.println("Um");
		if(idade == 2)
			System.out.println("Dois");
		if(idade == 3)
			System.out.println("Tres");
		if(idade == 4)
			System.out.println("Quatro");
		if(idade == 5)
			System.out.println("Cinco");
		if(idade == 10)
			System.out.println("Dez");
	}
}