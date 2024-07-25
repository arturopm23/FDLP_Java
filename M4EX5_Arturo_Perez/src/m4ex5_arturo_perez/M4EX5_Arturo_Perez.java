package m4ex5_arturo_perez;

import java.util.Scanner;

public class M4EX5_Arturo_Perez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1 = 0;
		int numero2 = 0;
		int operador = 0;
		String resultado = "";
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca el primer numero:");
		numero1 = entrada.nextInt();
		System.out.println("Introduzca el segundo numero:");
		numero2 = entrada.nextInt();
		System.out.println("Escoja una de las operaciones:\n"
				+ "1.Suma\n"
				+ "2.Resta\n"
				+ "3.Multiplicacion\n"
				+ "4.Division");
		operador = entrada.nextInt();
		entrada.close();
		
		switch(operador) {
		case 1:
			resultado = "El resultado es " + (numero1 + numero2);
		break;
		case 2:
			resultado = "El resultado es " + (numero1 - numero2);
		break;
		case 3:
			resultado = "El resultado es " + (numero1 * numero2);
		break;
		case 4:
			resultado = "El resultado es " + (numero1 / numero2);
		break;
		default:
			resultado = "Escoja una de las opciones disponibles.";
		}
		
		System.out.println(resultado);
	}

}
