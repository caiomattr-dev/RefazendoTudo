package whileLista1;
import java.util.Scanner;

public class While1Questao11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = 1;
		while(num <= 500) {
			if(num % 5 == 0 && num % 3 == 0) {
				System.out.println(num);
			}
			num++;
		}
	}
}
