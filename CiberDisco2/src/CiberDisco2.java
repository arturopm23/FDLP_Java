import java.util.Scanner;

public class CiberDisco2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaracion de variables
		int edad = 0;
		final int EDADMINIMA = 18;
		final int EDADMINIMAJUEVES = 16;
		String dia = "";
		String respuesta = "";
		
		//Inicio del metodo de entrada
		Scanner entrada = new Scanner(System.in);
		
		//Desarrollo
		System.out.println("Dime tu edad:" );
		edad = entrada.nextInt();
		
		System.out.println("Que dia es?");
		dia = entrada.next();
		
		if ((edad >= EDADMINIMA) || ((dia.equalsIgnoreCase("jueves")) && (edad >= EDADMINIMAJUEVES))) {
		respuesta = ("Puedes pasar");
		}
		
		else if (edad == 0){ 
		respuesta = ("Debes indicar una edad correcta");
		}
		
		else {
			respuesta = ("No puedes pasar") ;
		}
		
		//if	
		//switch
		//operador ternario
		
		System.out.println(respuesta);
		
		entrada.close();
		}
	}
		
		
		
		
		
		
	


