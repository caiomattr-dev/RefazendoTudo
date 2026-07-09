package forDoLista1;
import java.util.Scanner;

public class For1Questao5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int primo = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Insira número: ");
			int num = s.nextInt();
			
			if(num ==2) {
				primo++;
			}
			else
				if(num ==3) {
					primo++;
				}
				else
					if(num ==5) {
						primo++;
					}
					else
						if(num == 7) {
							primo++;
						}
						else
							if(num != 2 && num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0 && num != 1) {
								primo++;
							}
		}
		System.out.println("Possuem " + primo + " valores primos no programa.");
	}
}
