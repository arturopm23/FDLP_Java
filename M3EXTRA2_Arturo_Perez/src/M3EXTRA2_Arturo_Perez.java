import java.util.Scanner;

public class M3EXTRA2_Arturo_Perez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaracion de variables
		int varInt = 0;
		
		//Declaracion del metodo de entrada
		Scanner entrada = new Scanner(System.in);
		
		//Desarrollo
		System.out.println("Introduzca el numero entero:");
		varInt = entrada.nextInt();
		
		varInt = (varInt >= 10) ? (varInt) : (varInt = 1) ;
		System.out.println(varInt +
				(2 * varInt) +
				3 * varInt +
				4 * varInt +
				5 * varInt +
				6 * varInt +
				7 * varInt +
				8 * varInt +
				9 * varInt );
		entrada.close();
		
		
	}

}
