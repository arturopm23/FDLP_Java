package m4extra1_arturo_perez;

import java.util.Scanner;

public class M4EXTRA1_Arturo_Perez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dividendo = 0;
		final int DIVISORMINIMO = 2;
		final int DIVISORMAXIMO = 7;
		int divisor = 0;
		String multiple = "";
		String resultado = "";
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el divisor del 2 al 7");
		divisor = entrada.nextInt();
		System.out.println("Introduce el valor del dividendo");
		dividendo = entrada.nextInt();
		
		if ((divisor >= DIVISORMINIMO) && (divisor <= DIVISORMAXIMO)){
			multiple = (dividendo % divisor == 0) ? "Es multiple" : "No es multiple" ;
			resultado = multiple;
		}
		else {
			resultado = "ERROR, el divisor tiene que estar entre 2 y 7";
		}
		System.out.println(resultado);
		
		entrada.close();
	}

}
