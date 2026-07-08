package condicionaisLista1;
import java.util.Scanner;

public class Questao5Condicionais1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int soma = 0;
		
		System.out.println("Selecione um Prato: 1 - vegetariano, 2 – Peixe, 3 – Frango, 4 – Carne ");
		int p = s.nextInt();
		if(p > 4 || p < 1) {
			System.out.println("Informe valor válido.");
		  	p = s.nextInt();
	}
		if(p == 1) {
			soma += 180;
		}
		else
			if(p == 2) {
				soma += 230;
		}
		else
			if(p == 3) {
				soma += 250;
		}
		else
			if(p == 4) {
				soma += 350;
		}
		
		System.out.println("Selecione uma Sobremesa: 1 – Abacaxi, 2 – Sorvete diet, 3 – Mouse diet, 4 – Mouse chocolate ");
		int sb = s.nextInt();
		if(sb > 4 || sb < 1) {
			System.out.println("Informe valor válido.");
		  	sb = s.nextInt();
		}
		if(sb == 1) 
			soma += 75;
		else
			if(sb == 2) 
				soma += 110;
			else
				if(sb == 3) 
					soma += 170;
				else
					if(sb == 4) 
						soma += 200;
		
		System.out.println("Selecione uma Bebida: 1 – Chá, 2 - Suco de laranja, 3 – Suco de melão, 4 – Refrigerante diet. ");
		int b = s.nextInt();
		if(b > 4 || b < 1) {
			System.out.println("Informe valor válido.");
		  	b = s.nextInt();
		}
		if(b == 1) 
			soma += 20;
		else
			if(b == 2) 
				soma += 70;
			else
				if(b == 3) 
					soma += 100;
				else
					if(b == 4) 
						soma += 65;
		
		System.out.println("Qtnd total de cals: " + soma);
	}
}
