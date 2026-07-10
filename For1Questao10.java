package forDoLista1;
import java.util.Scanner;

public class For1Questao10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double qntdComer = 0;
		double qntdIndus = 0;
		int anos = 0;
		int aptosC = 0;
		int aptosI = 0;
		String resideCidade = "";
		String segundoG = "";
		String exp = "";
		String cursoS = "";
		
		for(int i = 1; i <= 3; i++) {
			System.out.println("Você reside na cidade? [sim] ou [não] ");
			resideCidade = s.next();
			
			if(resideCidade.equalsIgnoreCase("SIM") || resideCidade.equalsIgnoreCase("S")) {
				System.out.println("Há quanto tempo? ");
				anos = s.nextInt();
			}
			System.out.println("Você possui segundo grau completo? [sim] ou [não] ");
			segundoG = s.next();
			
			System.out.println("Você possui experiência comprovada? [sim] ou [não] ");
			exp = s.next();
			
			System.out.println("Você possui curso superior? [sim] ou [não] ");
			cursoS = s.next();
			
			if(anos >= 1 && segundoG.equalsIgnoreCase("SIM") && exp.equalsIgnoreCase("sim") && cursoS.equalsIgnoreCase("NAO")) {
				System.out.println("Apto para vaga na área de comércio. ");
				qntdComer++;
				aptosC++;
				
			}
			else
				if(segundoG.equalsIgnoreCase("SIM") && exp.equalsIgnoreCase("NAO") && cursoS.equalsIgnoreCase("NAO")) {
					System.out.println("Apto para a vaga de operacional. ");
					qntdIndus++;
					aptosI++;
				}
				else
					if(segundoG.equalsIgnoreCase("SIM") && exp.equalsIgnoreCase("SIM") && cursoS.equalsIgnoreCase("SIM")) {
						System.out.println("Apto para vaga de gerência. ");
						qntdIndus++;
						aptosI++;
					}
					else
						System.out.println("Candidato inapto para os requisitos básicos. ");
			System.out.println("");
			
		}
		System.out.println("Candidatos na área comercial: " + qntdComer + " \nCandidatos na área industrial: " + qntdIndus);
		System.out.println("");
		System.out.println("Percentual na área comercial: " + (qntdComer / 3) * 100 + "%" + "\nPercentual na área industrial: " + (qntdIndus / 3) * 100 + "%.");
		System.out.println("Aptos no comércio: " + aptosC + "\nAptos na indústria: " + aptosI);
	}
}
