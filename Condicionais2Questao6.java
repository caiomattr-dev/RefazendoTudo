package condicionaisLista2;
import java.util.Scanner;

public class Condicionais2Questao6 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insira os catetos do triângulo: ");
		int cat1 = s.nextInt();
		int cat2 = s.nextInt();
		
		System.out.println("Insira a hipotenusa do triângulo: ");
		int hip = s.nextInt();
		
		double hipConta = (Math.pow(hip, 2));
		double catConta = ((Math.pow(cat1, 2)) + (Math.pow(cat2, 2)));
		
		if(hipConta == catConta) {
			System.out.println("É um triângulo retângulo. ");
		}
		else
			System.out.println("Não é um triângulo retângulo. ");
	}
}
