package condicionaisLista2;
import java.util.Scanner;
import java.util.Random;

public class Condicionais2Questao5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int num1 = r.nextInt(10000);
		int num2 = r.nextInt(10000);
		int num3 = r.nextInt(10000);
		
		System.out.println(num1 + " " + num2 + " " + num3);
		System.out.println("Selecione a maneira de leitura [1]Crescente, [2]Decrescente");
		int escolha = s.nextInt();
		
		int menor = num1;
		int meio = num2;
		int maior = num3;
		
		if(num1 < num2 && num2 < num3) {
			 menor = num1;
			 meio = num2;
			 maior = num3;
		}
		if(num2 < num3 && num3 < num1) {
			 menor = num2;
			 meio = num3;
			 maior = num1;
		}
		if(num3 < num1 && num1 < num2) {
			 menor = num3;
			 meio = num1;
			 maior = num2;
		}
		if(num1 < num3 && num3 < num2) {
			 menor = num1;
			 meio = num3;
			 maior = num2;
		}
		if(num2 < num1 && num1 < num3) {
			 menor = num2;
			 meio = num1;
			 maior = num3;
		}
		if(num3 < num2 && num2 < num1) {
			 menor = num3;
			 meio = num2;
			 maior = num1;
		}
		
		if(escolha == 1) {
			System.out.println("Ordem crescente: " + menor + " " + meio + " " + maior);
		}
		
		if(escolha == 2) {
			System.out.println("Ordem decrescente: " + maior + " " + meio + " " + menor);
		}
		
		
	}
}
