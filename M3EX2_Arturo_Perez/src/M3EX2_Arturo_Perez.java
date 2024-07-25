import java.util.Scanner;

public class M3EX2_Arturo_Perez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaracion de variables 
		int numero1 = 0;
		int numero2 = 0;
		
		//Inicio del metodo de entrada
		Scanner entrada = new Scanner(System.in); 
		
		//Desarrollo
		System.out.println("Introduzca el primer numero entero:");
		numero1 = entrada.nextInt(); 
		System.out.println("Introduzca el segundo numero entero:");
		numero2 = entrada.nextInt(); 
		
		System.out.println("El resultado de la suma es: " + 
		(numero1 + numero2));
		System.out.println("El resultado de la resta es: " + 
		(numero1 - numero2));
		System.out.println("El resultado de la multiplicacion es: " + 
		(numero1 * numero2));
		System.out.println("El resultado de la division es: " + 
		(numero1 / numero2));
	
		//Cerramos scanner
		entrada.close();
	}

}
