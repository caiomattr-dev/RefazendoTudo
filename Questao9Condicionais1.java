package condicionaisLista1;
import java.util.Scanner;

public class Questao9Condicionais1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insira 5 valores inteiros: ");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		int num4 = s.nextInt();
		int num5 = s.nextInt();
		double m = (num1 + num2 + num3 + num4 + num5) / 5;
		
		System.out.println("Média igual a: " + m);
        if (num1 > m) System.out.println(num1);
        if (num2 > m) System.out.println(num2);
        if (num3 > m) System.out.println(num3);
        if (num4 > m) System.out.println(num4);
        if (num5 > m) System.out.println(num5);
		

	}

}
