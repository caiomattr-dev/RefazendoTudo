package condicionaisLista1;
import java.util.Scanner;

public class Questao6Condicionais1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] dias = {"domingo", "segunda", "terça", "quarta", "quinta", "sexta", "sábado"};
		
		System.out.println("Insira um número de 1 a 7: ");
		int num = s.nextInt();
		if(num < 1 || num > 7) {
			System.out.println("Número inválido, insira novamente. ");
			num = s.nextInt();
		}
		System.out.println(dias[num - 1]);
	}
}
