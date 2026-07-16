package subprogramasLista1;
import java.util.Scanner;

public class Subprogramas1Questao3 {
	public static String leitor(int num) {
		String leitor = "";
		if(num == 2 || num == 3 || num == 5 || num == 7) {
			leitor = "V";
		}
		else
			if(num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0 ) {
				leitor = "V";
			}
			else
				leitor = "F";
		
		return leitor;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insira um valor inteiro e positivo: ");
		int num = s.nextInt();
		if(num < 0) {
			System.out.println("Valor inválido, insira novamente: ");
			num = s.nextInt();
		}
		
		System.out.println(leitor(num));
	}
}
