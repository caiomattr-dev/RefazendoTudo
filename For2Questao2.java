package forDoLista2;
import java.util.Scanner;

public class For2Questao2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int primo = 0;
		int somaPrimo = 0;
		int somaNPrimo = 0;
		int maiorP = 0;
		int menorNP = Integer.MAX_VALUE;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Insira número: ");
			int num = s.nextInt();
			if(num < 0) {
				System.out.println("Número inválido, insira outro: ");
				num = s.nextInt();
			}
			if(num ==2) {
				primo++;
				somaPrimo += num;
				if(num > maiorP) {
					maiorP = num;
				}
			}
			else
				if(num ==3) {
					primo++;
					somaPrimo += num;
					if(num > maiorP) {
						maiorP = num;
					}
				}
				else
					if(num ==5) {
						primo++;
						somaPrimo += num;
						if(num > maiorP) {
							maiorP = num;
						}
					}
					else
						if(num == 7) {
							primo++;
							somaPrimo += num;
							if(num > maiorP) {
								maiorP = num;
							}
						}
						else
							if(num != 2 && num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0 && num != 1) {
								primo++;
								somaPrimo += num;
								if(num > maiorP) {
									maiorP = num;
								}
							}
							else
								if(num < menorNP) {
									menorNP = num;
								}
								somaNPrimo += num;
		}
		System.out.println("Possuem " + primo + " valores primos no programa.");
		System.out.println("Somatório de não primos: " + somaNPrimo + "\nSomatório de primos: " + somaPrimo);
		System.out.println("" + "\nMaior primo: " + maiorP + "\nMenor não primo: " + menorNP);
	}
}
