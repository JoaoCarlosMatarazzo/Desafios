package desafio;
import java.util.Scanner;
public class desafio2_Nquadrado {
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		int num, qs, a, b, c, d, e, f, g, h, i, j, dif ;
		qs = 55 * 55;
		a=1*1;
		b=2*2;
		c=3*3;
		d=4*4;
		e=5*5;
		f=6*6;
		g=7*7;
		h=8*8;
		i=9*9;
		j=10*10;
		num=a+b+c+d+e+f+g+h+i+j;
		dif = qs - num;
		System.out.println("A soma dos dez primeiros números é 55, logo o quadrado da soma se dá como:" + qs);
		System.out.println("A soma dos quadrados dos dez primeiros números naturais é:" + num);
		System.out.println("A diferença entre os cálculos se dá por:" + dif);
	}

}
