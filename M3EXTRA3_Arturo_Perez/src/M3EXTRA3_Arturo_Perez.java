import java.util.Scanner;

public class M3EXTRA3_Arturo_Perez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaracion de variables
		final int COBERTURALITRO = 12;
		int manos = 0;
		float altura = 0;
		float ancho = 0;
		float area = 0;
		float litros = 0;
		
		//Declaracion del metodo de entrada
		Scanner entrada = new Scanner(System.in);
		
		//Desarrollo
		System.out.println("Introduzca la altura:");
		altura = entrada.nextFloat();
		System.out.println("Introduzca el ancho:");
		ancho = entrada.nextFloat();
		System.out.println("Introduza el numero de manos:");
		manos = entrada.nextInt();
		
		//Resultado
		float manosEntero = (float) manos;
		area = (altura * ancho);
		area = (area * manosEntero);
		litros = (area/COBERTURALITRO);
		System.out.println("El total de litros es: " + 
		litros + " L");
		
		//Cierre de entrada
		entrada.close();
		
	}

}
