package forDoLista1;
import java.util.Scanner;

public class For1Questao7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double percP = 0;
		double percN = 0;
		double totalP = 0;
		double totalN = 0;
		
		for(int i = 0; i < 20; i++) {
			System.out.println("Insira um número: ");
			int num = s.nextInt();
			
			if(num > 0) {
				totalP++;
			}
			if(num < 0) {
				totalN++;
			}
		}
		percP = (totalP / 20) * 100;
		percN = (totalN / 20) * 100;
		System.out.println("Percentual de positivos: " + percP + "%" + ", percentual de negativos: " + percN + "%");
	}
}
