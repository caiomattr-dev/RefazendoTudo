package condicionaisLista1;
import java.util.Scanner;

public class Questao2Condicionais1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Informe seu peso: ");
		int peso = s.nextInt();
		System.out.println("Informe sua altura: ");
		double alt = s.nextDouble();
		
		double imc = peso / Math.pow(alt, 2);
		System.out.println("");
		System.out.println("IMC: " + imc);
		
		if(imc < 20)
			System.out.println("Abaixo do peso");
		if(imc >= 20 && imc <= 25)
			System.out.println("Peso normal");
		if(imc > 25 && imc <= 30)
			System.out.println("Sobrepeso");
		if(imc > 30 && imc <= 35)
			System.out.println("Obeso");
		if(imc > 35)
			System.out.println("Obesidade Mórbida");
	}

}
