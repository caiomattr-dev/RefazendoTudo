package whileLista2;
import java.util.Scanner;

public class While2Questao1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String continuar = "S";
		int primo = 0;
		int maiorP = 0;
		String contaSeRepete = "Não";
		int ehPrimo = 0;
		int numI = 0;
		
		while(continuar.equalsIgnoreCase("S")) {
			System.out.println("Digite um número de até 5 dígitos: ");
			int num = s.nextInt();
			String bin = "";
			numI = num;
			if(num > 99999) {
				System.out.println("Número inválido, insira outro: ");
				num = s.nextInt();
		}
			if(num == 0) {
				bin = "0";
			}
			else
				while(numI >= 1) {
					int resto = numI % 2;
					bin = resto + bin;
					numI = numI / 2;
				}
			
			if(num ==2) {
				primo++;
				ehPrimo++;
				if(num > maiorP) {
					maiorP = num;
				}
			}
			else
				if(num ==3) {
					primo++;
					ehPrimo++;
					if(num > maiorP) {
						maiorP = num;
					}
				}
				else
					if(num ==5) {
						primo++;
						ehPrimo++;
						if(num > maiorP) {
							maiorP = num;
						}
					}
					else
						if(num == 7) {
							primo++;
							ehPrimo++;
							if(num > maiorP) {
								maiorP = num;
							}
						}
						else
							if(num != 2 && num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0 && num != 1) {
								primo++;
								ehPrimo++;
								if(num > maiorP) {
									maiorP = num;
								}
							}
							else
								ehPrimo--;
			
			if(ehPrimo >= 3) {
				contaSeRepete = "Sim";
			}
			
			System.out.println(bin);
			System.out.println("Você deseja continuar? ");
			continuar = s.next();
		}
		
		System.out.println("Quantidade de primos: " + primo);
		System.out.println("Maior primo: " + maiorP);
		System.out.println("Houve em algum momento pelo menos três primos consecutivos? " + contaSeRepete);
	}
}
