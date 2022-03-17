package desafio;
import java.util.Scanner;
public class desafio1_triangulo {
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		double ladoA, ladoB, ladoC;
		
		System.out.println("Por favor, apresente o valor do primeiro lado do trângulo para ser analisado:");
		ladoA = entrada.nextDouble();
		System.out.println("Por favor, apresente o valor do segundo lado do trângulo para ser analisado:");
		ladoB = entrada.nextDouble();
		System.out.println("Por favor, apresente o valor do terceiro lado do trângulo para ser analisado:");
		ladoC = entrada.nextDouble();
	
		if(ladoA < (ladoB + ladoC) && ladoB < (ladoA + ladoC) && ladoC < (ladoA + ladoB)) 
			{
			if(ladoA == ladoB && ladoB == ladoC)
				System.out.println("Pois bem, este triângulo é equilátero.");
			else if(ladoA == ladoB || ladoB == ladoC || ladoC == ladoA)
				System.out.println("Pois muito bem, este triângulo é isósceles");
			else if(ladoA != ladoB && ladoA != ladoC && ladoC != ladoB)
				System.out.println("Muito bom, este triângulo é escaleno");
			else
				System.out.println("Desculpe, mas estes não são valores de um trângulo válido.");
			}
	
	}
}
