package whileLista1;
import java.util.*;

public class While1Questao1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String continuar = "S";
		while(continuar.equalsIgnoreCase("S")) {
			System.out.println("Digite um número de até 5 dígitos: ");
			int n = s.nextInt();
			String bin = "";
			if(n > 99999) {
				System.out.println("Número inválido, insira outro: ");
				n = s.nextInt();
		}
			if(n == 0) {
				bin = "0";
			}
			else
				while(n >= 1) {
					int resto = n % 2;
					bin = resto + bin;
					n = n / 2;
				}
			System.out.println(bin);
			System.out.println("Você deseja continuar? ");
			continuar = s.next();
		}
		System.out.println("Fim do programa.");
	}
}
