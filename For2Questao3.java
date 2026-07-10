package forDoLista2;
import java.util.Scanner;

public class For2Questao3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		int num = s.nextInt();
		int conta = num;
		int resultado = 1;
		
		if(num == 0) {
			System.out.println("Fatorial de " + num + " é = 1");
		}
		for(int i = num - 1; i > 0; i--) {
			conta = conta * i;
			resultado = conta;
			conta = resultado;
		}
		System.out.println("Quantas casas da tabuada você deseja ver? ");
		int casas = s.nextInt();
		for(int i = 1; i <= casas; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
		System.out.println("");
		System.out.println("O fatorial de " + num + "! é: " + conta);
	}
}
