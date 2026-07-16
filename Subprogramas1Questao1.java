package subprogramasLista1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Subprogramas1Questao1 {
	public static double volEsfera(double raio, Scanner s) {
		double volume = ((4.0/3.0) * Math.PI * (Math.pow(raio, 3)));
		return volume;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###00.0");
		
		System.out.println("Insira o raio da esfera: ");
		double raio = s.nextInt();
		volEsfera(raio, s);
		System.out.println("O volume é: " + df.format(volEsfera(raio, s)));
	}
}
