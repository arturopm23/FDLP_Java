package m4ex3_arturo_perez;

import java.util.Scanner;

public class M4EX3_Arturo_Perez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palabra = "";
		int caracteres = 0;
		String resultado = "";
		char letra = ' ';
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe la palabra en minusculas:");
		palabra = entrada.next();
		
		//comprobar el numero de caracteres
		caracteres = palabra.length();
		
		//comprobar la primera letra y transformarla a minusculas por si el usuario la pone en mayusculas
		letra = palabra.toLowerCase().charAt(0);
		
		if ( caracteres == 9  && letra == 'h' ){	
			resultado = "La palabra es bonita";
		}
			else if ( caracteres == 5  && letra == 'p' ) {
			resultado = "La palabra es bonita";
		}
		else {
			resultado = "Es una palabra fea";
		}
		
		System.out.println(resultado);
		entrada.close();
	}
}
