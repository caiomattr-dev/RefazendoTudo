package forDoLista1;
import java.util.Scanner;

public class For1Questao8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int contBomAproveitamento = 0;
		double contExemplar = 0;
		double percE = 0;
		double mediaAnual = 0;
		double a1 = 0;
		double a2 = 0;
		double a3 = 0;
		double a4 = 0;
		double a5 = 0;
		
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.println("Insira suas notas bimestrais: ");
			double n1 = s.nextInt();
			double n2 = s.nextInt();
			double n3 = s.nextInt();
			double n4 = s.nextInt();
			mediaAnual = (n1 + n2 + n3 + n4) / 4;
			
			if(mediaAnual < 7) {
				System.out.println("Você reprovou. ");
			}
			if(i == 1) {
				a1 = mediaAnual;
				if(mediaAnual <= 7.9 && mediaAnual >= 7) {
					System.out.println("honras pelo bom aproveitamento");
					contBomAproveitamento++;
				}
				if(mediaAnual <= 8.9 && mediaAnual >= 8) {
					System.out.println("honras pelo ótimo aproveitamento");
				}
				if(mediaAnual <= 10 && mediaAnual >= 9) {
					System.out.println("honras pelo excelente aproveitamento");
					if(n1 == 10 && n2 ==10 || n1 == 10 && n3 == 10 || n1 == 10 && n4 == 10 || n2 == 10 && n3 == 10 || n2 == 10 && n4 == 10) {
						System.out.println("Aluno exemplar");
						contExemplar++;
					}
				}
			}
			if(i == 2) {
				a2 = mediaAnual;
				if(mediaAnual <= 7.9 && mediaAnual >= 7) {
					System.out.println("honras pelo bom aproveitamento");
					contBomAproveitamento++;
				}
				if(mediaAnual <= 8.9 && mediaAnual >= 8) {
					System.out.println("honras pelo ótimo aproveitamento");
				}
				if(mediaAnual <= 10 && mediaAnual >= 9) {
					System.out.println("honras pelo excelente aproveitamento");
					if(n1 == 10 && n2 ==10 || n1 == 10 && n3 == 10 || n1 == 10 && n4 == 10 || n2 == 10 && n3 == 10 || n2 == 10 && n4 == 10) {
						System.out.println("Aluno exemplar");
						contExemplar++;
					}
				}
			}
			if(i == 3) {
				a3 = mediaAnual;
				if(mediaAnual <= 7.9 && mediaAnual >= 7) {
					System.out.println("honras pelo bom aproveitamento");
					contBomAproveitamento++;
				}
				if(mediaAnual <= 8.9 && mediaAnual >= 8) {
					System.out.println("honras pelo ótimo aproveitamento");
				}
				if(mediaAnual <= 10 && mediaAnual >= 9) {
					System.out.println("honras pelo excelente aproveitamento");
					if(n1 == 10 && n2 ==10 || n1 == 10 && n3 == 10 || n1 == 10 && n4 == 10 || n2 == 10 && n3 == 10 || n2 == 10 && n4 == 10) {
						System.out.println("Aluno exemplar");
						contExemplar++;
					}
				}
			}
			if(i == 4) {
				a4 = mediaAnual;
				if(mediaAnual <= 7.9 && mediaAnual >= 7) {
					System.out.println("honras pelo bom aproveitamento");
					contBomAproveitamento++;
				}
				if(mediaAnual <= 8.9 && mediaAnual >= 8) {
					System.out.println("honras pelo ótimo aproveitamento");
				}
				if(mediaAnual <= 10 && mediaAnual >= 9) {
					System.out.println("honras pelo excelente aproveitamento");
					if(n1 == 10 && n2 ==10 || n1 == 10 && n3 == 10 || n1 == 10 && n4 == 10 || n2 == 10 && n3 == 10 || n2 == 10 && n4 == 10) {
						System.out.println("Aluno exemplar");
						contExemplar++;
					}
				}
			}
			if(i == 5) {
				a5 = mediaAnual;
				if(mediaAnual <= 7.9 && mediaAnual >= 7) {
					System.out.println("honras pelo bom aproveitamento");
					contBomAproveitamento++;
				}
				if(mediaAnual <= 8.9 && mediaAnual >= 8) {
					System.out.println("honras pelo ótimo aproveitamento");
				}
				if(mediaAnual <= 10 && mediaAnual >= 9) {
					System.out.println("honras pelo excelente aproveitamento");
					if(n1 == 10 && n2 ==10 || n1 == 10 && n3 == 10 || n1 == 10 && n4 == 10 || n2 == 10 && n3 == 10 || n2 == 10 && n4 == 10) {
						System.out.println("Aluno exemplar");
						contExemplar++;
					}
				}
			}
			System.out.println("");
		}
		percE = (contExemplar / 5) * 100;
		System.out.println("Qntd de alunos com bom aproveitamento: " + contBomAproveitamento + ", percentual de alunos exemplares: " + percE + "%");
	}
}
