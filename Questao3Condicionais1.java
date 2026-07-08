package condicionaisLista1;
import java.util.Scanner;

public class Questao3Condicionais1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Informe seu saldo médio: ");
		double saldo = s.nextInt();
		double cred = 0;
		
		if(saldo < 0) {
			System.out.println("Informe saldo válido. ");
			saldo = s.nextInt();
		}
		if(saldo <= 500) {
			System.out.println("Nenhum crédito disponível para esse valor. Saldo: " + saldo);
		}
		
		if(saldo <= 1000 && saldo > 500) {
			cred = (saldo * 0.30);
			saldo += cred;
			System.out.println("Saldo final: " + saldo + ", crédito recebido: " + cred);
		}
		else
			if(saldo >= 1001 && saldo <= 3000) {
				cred = (saldo * 0.40);
				saldo += cred;
				System.out.println("Saldo final: " + saldo + " crédito recebido: " + cred);
			}
		
		if(saldo > 3000) {
			cred = (saldo * 0.50);
			saldo += cred;
			System.out.println("Saldo final: " + saldo + " crédito recebido: " + cred);
		}
	}

}
