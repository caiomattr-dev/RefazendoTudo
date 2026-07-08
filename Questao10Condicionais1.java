package condicionaisLista1;
import java.util.Scanner;

public class Questao10Condicionais1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe o peso do peixe: ");
		int p = s.nextInt();
		int multa = 0;
		if(p > 500) {
			multa = (p - 500) * 4;
			System.out.println("Peso máximo ultrapassado, multa à pagar: " + multa);
		}
		else
			System.out.println("Peso dentro do limite");

	}

}
