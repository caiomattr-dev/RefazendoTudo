package forDoLista1;
import java.util.Scanner;

public class For1Questao8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int contBom = 0;
		int contExemplar = 0;
		double nota = 0;
		String citacao = "";
		String nome;
		String bimestres10 = "";
		
		for(int i = 1 ; i <= 5 ; i++) {
			double somaNota = 0;
			int notas10 = 0;
			
			System.out.println("Informe nome ");
			nome = s.next();
			for(int n = 1; n <= 4 ; n++) {
				System.out.println("Informe nota do semestre " + n);
				nota = s.nextDouble();
				somaNota += nota;
				if(nota == 10) {
					notas10++;
					bimestres10 += n + ", ";
				}
			}
			if((somaNota/4) >= 7 && (somaNota/4) <= 7.9) {
				contBom++;
				citacao = "honras pelo bom aproveitamento";
			}
			else
				if((somaNota/4) >= 8 && (somaNota/4) <= 8.9)
					citacao = "honras pelo ótimo aproveitamento";
				else
					if((somaNota/4) >= 9 && (somaNota/4) <= 10 && notas10 >= 2){
						contExemplar++;
						citacao = "aluno exemplar.Bimestres com media 10:" + bimestres10;
					}
					else
						citacao = "honras pelo excelente aproveitamento";
			
			System.out.println("nome == " + nome + "\nmedia anual == " + (somaNota/4) + 
					   "\ncitacao == " + citacao + "\n");
		}
		System.out.println("horas pelo bom aproveitamento == " + contBom + 
				   "\npercentual aluno exemplar == " + ((contExemplar * 100)/50) + "%");
	}
}
