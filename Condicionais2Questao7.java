package condicionaisLista2;
import java.util.Random;
import java.util.Scanner;

public class Condicionais2Questao7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		int x1 = r.nextInt(100);
		int x2 = r.nextInt(100);
		int y1 = r.nextInt(100);
		int y2 = r.nextInt(100);
		System.out.println("Ponto 1: " + x1 + "," + y1 + " Ponto 2: " + x2 + "," + y2);
		
		if(x1 > x2) {
			System.out.println("Valores inválidos.");
			System.out.println("");
			x1 = r.nextInt(100);
			x2 = r.nextInt(100);
			y1 = r.nextInt(100);
			y2 = r.nextInt(100);
			System.out.println("Ponto 1: " + x1 + "," + y1 + " Ponto 2: " + x2 + "," + y2);
		}

		double raiz = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
		System.out.println("Distância = " + raiz);
	}
}
