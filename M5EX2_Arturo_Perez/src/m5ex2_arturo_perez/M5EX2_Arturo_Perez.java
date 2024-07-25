package m5ex2_arturo_perez;

import java.util.ArrayList;
import java.util.Scanner;

public class M5EX2_Arturo_Perez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numerosMedio = new ArrayList<Integer>();
		int numero1 = 0;
		int numero2 = 0;
		int suma = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca el primer numero:");
		numero1 = entrada.nextInt();
		
		System.out.println("Introduzca el segundo numero:");
		numero2 = entrada.nextInt();
		
		//Calcular suma si numero2 es mayor que numero1
		if (numero1 < numero2){
			for (int i = numero1; i <= numero2 ; i++) {
				suma = (suma + i);
				numerosMedio.add(i) ;
				
				//Cuando haya acabado de sumar, mostrar resultados
				if (i == numero2) {
					System.out.print(numero1 + " i " + numero2 + " --> resultat = ");
					for (i = 0; i < numerosMedio.size() ; i++) {
						System.out.print(numerosMedio.get(i));
						if (i < numerosMedio.size()- 1) {
						System.out.print(" + ");
						}
					}
					System.out.println(" = " + suma);
					i = numero2 + 1; //Cerrar el bucle
				}
			}
		}
		//Calcular suma si numero1 es mayor que numero2
		else if (numero1 > numero2) {
			for (int i = numero2; i <= numero1 ; i++) {
				suma = (suma + i);
				numerosMedio.add(i) ;
				
				//Cuando haya acabado de sumar, mostrar resultados
				if (i == numero1) {
					System.out.print("El resultado es ");
					for (i = 0; i < numerosMedio.size() ; i++) {
						System.out.print(numerosMedio.get(i));
						if (i < numerosMedio.size() - 1) {
						System.out.print(" + ");
						}
					}
					System.out.println(" = " + suma);
					i = numero1 +1;	//Cerrar el bucle
				}
		}
		}
		else {
			System.out.println("Introduzca 2 numeros diferentes");
		}
		entrada.close();
	}

}
