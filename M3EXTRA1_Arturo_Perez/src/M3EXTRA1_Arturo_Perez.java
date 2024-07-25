import java.util.Scanner;

public class M3EXTRA1_Arturo_Perez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaracion de variables
		int numero = 0;
		
		//Declaracion del metodo de entrada
		Scanner entrada = new Scanner(System.in);
		
		//Desarrollo
		System.out.println("Introduzca el numero entero:");
		numero = entrada.nextInt();
		System.out.println("El doble de " + numero +
				" es " + (2 * numero));
		System.out.println("El triple de " + numero +
				" es " + (3 * numero));
		
		//Cierre del metodo de entrada
		entrada.close();
		
	}

}
