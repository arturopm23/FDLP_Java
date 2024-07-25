package conducir;

import java.util.Scanner;

public class Conducir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int edad = 0;
			String permiso = "" ;
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Que edad tienes?");
			edad = entrada.nextInt();
			
			permiso = (edad >= 18) ? "Puedes conducir" : "No puedes conducir" ;
			
			System.out.println(permiso);
			
			entrada.close();
	}

}
