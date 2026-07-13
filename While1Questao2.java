package whileLista1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class While1Questao2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,##0.00");
		
		int f = 50;
		double c = 0;
		while(f <= 150) {
			c = (5.0/9.0) * (f - 32);
			System.out.println(f + "f = " + df.format(c));
			f++;
		}
	}
}
