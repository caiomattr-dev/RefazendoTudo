package condicionaisLista2;
import java.util.Scanner;

public class Questao4Condicionais1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Insira sua idade em dias totais: ");
		int diasT = s.nextInt();
		
		int anos = diasT / 365;
		int restoA = diasT % 365;
		
		int meses = restoA / 30;
		int restoM = restoA % 30;
		
		int dias = restoM;
		System.out.println(anos + " " + meses + " " + dias);
	}
}
