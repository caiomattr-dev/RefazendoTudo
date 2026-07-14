package whileLista1;
import java.util.Scanner;

public class While1Questao12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = 25;
		int conta = 0;
		while(num <= 200) {
			if(num % 2 ==0) {
				conta += num;
			}
			num++;
		}
		System.out.println(conta);
	}
}
