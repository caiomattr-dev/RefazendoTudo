package condicionaisLista2;
import java.util.Scanner;

public class Questao1Condicionais2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Insira suas 3 notas:");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		double mA = 0;
		System.out.println("Qual o tipo de média? [1] Aritimética, [2] Ponderada ");
		int tipoM = s.nextInt();
		if(tipoM < 1 || tipoM > 2) {
			System.out.println("Tipo inválido, insira novamente. ");
			tipoM = s.nextInt();
		}	
		if(tipoM == 1) {
			mA = (n1 + n2 + n3) / 3;
			System.out.println("Média = " + mA);
	}
		if(tipoM == 2) {
			System.out.println("Insira os pesos respectivos: ");
			int p1 = s.nextInt();
			int p2 = s.nextInt();
			int p3 = s.nextInt();
			double mP = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / (p1 + p2 + p3);
			System.out.println("Média = " + mP);
		}
	}
}
