import java.util.Scanner;

public class M4EX1_Arturo_Perez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaracion de variables
		int numero1 = 0;
		int numero2 = 0;
		String resultado = "";
		
		//Inicio del metodo de entrada
		Scanner entrada = new Scanner(System.in);
		
		//Desarrollo
		System.out.println("Introduce el primer numero entero:");
		numero1 = entrada.nextInt();
		System.out.println("Introduzca el segundo numero entero:");
		numero2 = entrada.nextInt();
		
		if(numero1 > numero2) {
			resultado = ("El numero mas grande es " + numero1);
		}	
		else if(numero1 < numero2) {
			resultado = ("El numero mas grande es " + numero2);
		}
		else {
			resultado = ("Los dos numeros son iguales");
		}
		
		System.out.println(resultado);
		
		//cierre del metodo de entrada
		entrada.close();
			
		
		
	}

}
