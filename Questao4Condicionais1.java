package condicionaisLista1;
import java.util.Scanner;

public class Questao4Condicionais1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Informe sua idade: ");
		int idade = s.nextInt();
		
		if(idade == 16 || idade == 17 || idade > 65) {
			System.out.println("Eleitor facultativo. ");
		}
		
		if(idade > 17 && idade < 65) {
			System.out.println("Eleitor obrigatório. ");
		}
		
		if(idade < 16) {
			System.out.println("Não eleitor");
		}

	}

}
