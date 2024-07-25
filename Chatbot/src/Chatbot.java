import java.util.Scanner;

public class Chatbot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definicion de variables y metodos de entrada
		String nombre = " ";
		String asignatura = " ";
		Scanner entrada = new Scanner (System.in); //Metodo de entrada
		
		//Desarrollo
		System.out.println("Nombre:");
		nombre = entrada.nextLine(); 
		
		System.out.println ("Hola " + nombre + ", que estudias?");
		asignatura = entrada.nextLine(); 
		
		System.out.println ("Enhorabuena " + nombre + 
				", seguro que eres el/la mejor estudiante de " + asignatura);
		
		//Cerramos scanner
		entrada.close();
	}

}
