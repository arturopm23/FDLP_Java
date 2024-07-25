package m5ex1_arturo_perez;

import java.util.ArrayList;
import java.util.Scanner;

public class M5EX1_Arturo_Perez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//repetir con forEach
		int numero = 0;
		ArrayList<String> nombres = new ArrayList<String>(numero);
		int numerotexto = 1;
		String nombre = "";
		
		Scanner entrada = new Scanner(System.in);
		
		//numero de nombres
		System.out.println("Cuantos nombres vas a introducir?");
		numero = entrada.nextInt();
		
		//usuario enumera los nombres
		for (int i = 0; i < numero; i++) {
		System.out.println("Introduzca el " + numerotexto + " nombre:");
		numerotexto = (numerotexto + 1);
		nombre = entrada.next();
		
		if (nombre.toLowerCase().charAt(0) == 'a') {
			nombres.add(nombre);
		}
		}
		entrada.close();
	
		
		System.out.println("Los nombres que comienzan con A son: " + nombres);
		
	}

}
