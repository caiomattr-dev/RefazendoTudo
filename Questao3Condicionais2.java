package condicionaisLista2;
import java.util.Scanner;

public class Questao3Condicionais2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Insira sua idade em anos, meses e dias: ");
		int anos = s.nextInt();
		int meses = s.nextInt();
		int dias = s.nextInt();
		int diasT = (anos * 365) + (meses * 30) + dias;
		System.out.println(diasT);
	}
}
