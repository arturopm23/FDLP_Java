import java.util.Scanner;

public class M3EX1_Arturo_Perez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definicion de variables
		String nombre = " " ;
		String apellido = " " ;
		byte edad = 0 ;
		
		//Definicion del metodo de entrada
		Scanner entrada = new Scanner(System.in); 
		
		//Desarrollo
		System.out.println("Hola, com et dius?");
		nombre = entrada.nextLine(); 
		
		System.out.println("I el teu cognom?");
		apellido = entrada.nextLine(); 
		
		System.out.println("Quina edat tens?");
		edad = entrada.nextByte();
		
		System.out.println("Hola " + nombre + " " + apellido +
				", tens " + edad + " anys");
		
		//Cierre del scanner
		entrada.close();
		
	}

}
