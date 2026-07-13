package whileLista1;
import java.util.Scanner;

public class While1Questao3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double totalCompra = 0;
		double totalVenda = 0;
		int lucro10 = 0;
		int lucro20 = 0;
		int lucroMaisq20 = 0;
		double venda = 0;
		double compra = 0;
		double lucro = 0;
		
		System.out.println("Insira uma mercadoria: ");
		String mercadoria = s.next();
		
		while(!mercadoria.equalsIgnoreCase("X")) {
			System.out.println("Insira o preço de venda da mercadoria: ");
			venda = s.nextDouble();
			System.out.println("Insira o preço de compra da mercadoria: ");
			compra = s.nextDouble();
			
			lucro = ((venda - compra) / compra) * 100;
			if(lucro < 10) {
				lucro10++;
			}
			else
				if(lucro >= 10 && lucro <= 20) {
					lucro20++;
				}
				else
					lucroMaisq20++;
			
			totalCompra += compra;
			totalVenda += venda;
			
			System.out.println("Mercadoria: " + mercadoria + "\nPreço venda: " + venda + "\nPreço compra: " + compra);
			System.out.println("Lucro: " + lucro + "%");
			System.out.println("");
			System.out.println("\nInserir outra mercadoria? [sim] ou [não]");
			mercadoria = s.next();
			if(mercadoria.equalsIgnoreCase("SIM")) {
				System.out.println("Insira mercadoria: ");
				mercadoria = s.next();
			}
			else
				break;
		}
		System.out.println("\nRESULTADO");
        System.out.println("Lucro menor que 10%: " + lucro10);
        System.out.println("Lucro entre 10% e 20%: " + lucro20);
        System.out.println("Lucro maior que 20%: " + lucroMaisq20);

        System.out.println("Total de compra: R$ " + totalCompra);
        System.out.println("Total de venda: R$ " + totalVenda);
        System.out.println("Lucro total: R$ " + (totalVenda - totalCompra));
	}
}
