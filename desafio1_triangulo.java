package desafio;
import java.util.Scanner;
public class desafio1_triangulo {
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		double ladoA, ladoB, ladoC;
		
		System.out.println("Por favor, apresente o valor do primeiro lado do tr�ngulo para ser analisado:");
		ladoA = entrada.nextDouble();
		System.out.println("Por favor, apresente o valor do segundo lado do tr�ngulo para ser analisado:");
		ladoB = entrada.nextDouble();
		System.out.println("Por favor, apresente o valor do terceiro lado do tr�ngulo para ser analisado:");
		ladoC = entrada.nextDouble();
	
		if(ladoA < (ladoB + ladoC) && ladoB < (ladoA + ladoC) && ladoC < (ladoA + ladoB)) 
			{
			if(ladoA == ladoB && ladoB == ladoC)
				System.out.println("Pois bem, este tri�ngulo � equil�tero.");
			else if(ladoA == ladoB || ladoB == ladoC || ladoC == ladoA)
				System.out.println("Pois muito bem, este tri�ngulo � is�sceles");
			else if(ladoA != ladoB && ladoA != ladoC && ladoC != ladoB)
				System.out.println("Muito bom, este tri�ngulo � escaleno");
			else
				System.out.println("Desculpe, mas estes n�o s�o valores de um tr�ngulo v�lido.");
			}
	
	}
}
