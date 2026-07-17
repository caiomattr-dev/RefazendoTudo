package subprogramasLista1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Subprogramas1Questao11 {
	public static double peso(double alt, String sex) {
		double pesoIdeal = 0;
		if(sex.equalsIgnoreCase("HOMEM")) {
			pesoIdeal = 72.7 * alt - 58;
		}
		else
			if(sex.equalsIgnoreCase("MULHER")) {
				pesoIdeal = 62.1 * alt - 44.7;
			}
		return pesoIdeal;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###00.0");
		
		System.out.println("Insira sua altura em metros: ");
		double alt = s.nextDouble();
		boolean confere = true;
		if(alt > 3 || alt < 0) {
			confere = false;
			while(!confere) {
				System.out.println("Altura inválida, insira novamente: ");
				alt = s.nextDouble();
				if(alt > 0 && alt < 3) {
					confere = true;
				}
			}
		}
		System.out.println("Insira seu sexo: [homem] ou [mulher]");
		String sexo = s.next();
		boolean confereS = true;
		
		if(!sexo.equalsIgnoreCase("HOMEM") && !sexo.equalsIgnoreCase("MULHER")) {
			confereS = false;
			while(!confereS) {
				System.out.println("Sexo inválido, insira novamente: ");
				sexo = s.next();
				if(sexo.equalsIgnoreCase("HOMEM") || sexo.equalsIgnoreCase("MULHER")) {
					confereS = true;
				}
			}
		}
		peso(alt, sexo);
		System.out.println("O peso ideal para um(a) " + sexo + " é: " + df.format(peso(alt,sexo)) + "kg.");
	}
}
