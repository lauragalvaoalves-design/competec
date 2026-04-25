import java.util.Scanner;

public class frutas
{
	public static void main(String[] args) {
	   
	   Scanner scanner = new Scanner(System.in);
	   
	    double abacaxi = 7.30;
	    double maca = 2.00;
	    double pera = 3.00;
	    
	    
		System.out.println("Quantos abacaxis você deseja?");
		int qtdabacaxi = scanner.nextInt();
		//System.out.println (qtdabacaxi);
		System.out.println("Quantas maçãs você deseja?");
		int qtdmaca = scanner.nextInt();
		//System.out.println(qtdmaca);
		System.out.println("Quantas pêras você deseja?");
		int qtdpera = scanner.nextInt();
		//System.out.println(qtdpera);
		
		double soma_compra = abacaxi*qtdabacaxi + maca*qtdmaca + pera*qtdpera;
		System.out.println("Valor da compra:" + soma_compra);
	}
}
