package whileLista2;
import java.util.Scanner;
import java.text.DecimalFormat;

public class While2Questao6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###00.0");
		
		double paisA = 5000000;
		double paisB = 7000000;
		int anos = 0;
		double diferenca = 0;
		
		while(paisA < paisB) {
			System.out.println("População país A: " + df.format(paisA) + "; no ano: " + anos);
			System.out.println("População país B: " + df.format(paisB) + "; no ano: " + anos);
			System.out.println("");
			paisA = paisA + (paisA * 0.03);
			paisB = paisB + (paisB * 0.02);
			if(anos == 1) {
				diferenca = paisB - paisA;
			}
			anos++;
		}
		double diferenca2 = paisA - paisB;
		System.out.println("Demoraram: " + anos + " anos para o país A ultrapassar o país B.");
		System.out.println("A diferença no ano 1 foi de: " + df.format(diferenca) + "\nNo momento de superação, a diferença foi de: " + df.format(diferenca2));
	}
}
