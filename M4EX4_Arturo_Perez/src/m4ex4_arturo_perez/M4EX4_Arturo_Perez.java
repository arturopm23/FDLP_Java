package m4ex4_arturo_perez;

import java.util.Scanner;

public class M4EX4_Arturo_Perez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 0;
		String resultado = "";
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca el numero del 0 a 10:");
		numero = entrada.nextInt();
		
		switch (numero) {
		case 1:
			resultado = "uno";
			break;
		case 2:
			resultado = "dos";
			break;
		case 3:
			resultado = "tres";
			break;
		case 4:
			resultado = "cuatro";
			break;
		case 5:
			resultado = "cinco";
			break;
		case 6:
			resultado = "seis";
			break;
		case 7:
			resultado = "siete";
			break;
		case 8:
			resultado = "ocho";
			break;
		case 9:
			resultado = "nueve";
			break;
		case 10:
			resultado = "diez";
			break;
		default:
			resultado = "introduce un numero valido";
			
		}
		
		System.out.println(resultado);
		entrada.close();
		
	}

}
