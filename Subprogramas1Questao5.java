package subprogramasLista1;
import java.util.Scanner;

public class Subprogramas1Questao5 {
	public static void transforma(int seg) {
		int h = 0;
		int restoH = 0;
		
		int min = 0;
		int restoM = 0;
		
		int segundosResto = 0;
		
		if(seg >= 3600) {
			h = seg / 3600;
			restoH = seg % 3600;
		}
		
		if(seg < 3600 && seg >= 60) {
			min = seg / 60;
			restoM = seg % 60;
			segundosResto = restoM;
		}
		else
			if(restoH >= 60 && restoH < 3600) {
				min = restoH / 60;
				restoM = restoH % 60;
				segundosResto = restoM;
			}
			else
				segundosResto = seg;
		
		System.out.println("Horas: " + h + ", Minutos: " + min + ", Segundos: " + segundosResto);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insira o tempo de duração de um processo em segundos: ");
		int seg = s.nextInt();
		transforma(seg);
	}
}
