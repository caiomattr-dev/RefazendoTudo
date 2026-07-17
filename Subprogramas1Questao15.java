package subprogramasLista1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Subprogramas1Questao15 {
	public static double conta(int num) {
		double s = 0;
		for(int i = 1; i <= num; i++) {
			s += 1f/i;
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###0.0");
		
		System.out.println("Insira um valor inteiro e positivo: ");
		int num = s.nextInt();
		boolean confere = true;
		if(num < 0) {
			confere = false;
				while(!confere) {
					System.out.println("Número inválido, insira outro: ");
					num = s.nextInt();
					if(num >= 0) {
						confere = true;
				}
			}
		}
		conta(num);
		System.out.println("Número: " + df.format((conta(num))));
	}
}
