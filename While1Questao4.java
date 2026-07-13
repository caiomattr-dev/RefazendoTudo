package whileLista1;
import java.text.DecimalFormat;
import java.util.Scanner;

public class While1Questao4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,##0.00");
		double vagas = 0;
		double h = 0;
		double m = 0;
		double cPorVaga = 0;
		double porcF = 0;
		
		double maiorCv = Integer.MIN_VALUE;
		String maiorCV = "";
		
		
		System.out.println("Insira o código do curso: [X para parar o programa]");
		String curso = s.next();
		
		while(!curso.equalsIgnoreCase("X")) {
			System.out.println("Insira o número de vagas: ");
			vagas = s.nextInt();
			System.out.println("Insira a quantidade de candidatos homens: ");
			h = s.nextInt();
			System.out.println("Insira a quantidade de candidatos mulheres: ");
			m = s.nextInt();
			
			cPorVaga = ((h + m) / vagas);
			
			porcF = (m / (m + h)) * 100;
			
			if(cPorVaga > maiorCv) {
				maiorCv = cPorVaga;
				maiorCV = "Curso com o maior CV : " + curso + ", com o CV de: " + maiorCv;
			}
			System.out.println("Número de candidatos por vaga: " + cPorVaga + "\nPorcentagem de mulheres: " + df.format(porcF) + "%");
			System.out.println("");
			System.out.println("Deseja continuar? [x para parar]");
			curso = s.next();
			if(!curso.equalsIgnoreCase("X")) {
				System.out.println("" + "\nInsira código do curso: ");
				curso = s.next();
			}
		}
		System.out.println(maiorCV);
	}
}
