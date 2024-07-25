package menu;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion = 0;
		String respuesta = "";
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Welcome to Ciber Restaurant\n"
				+ "1. Pollo con patatas\n"
				+ "2. Enslada cesar\n"
				+ "3. Hummus con crudites\n"
				+ "4. PokeBowl\n"
				+ "0. No quiero nada mas");
		
		opcion = entrada.nextInt();
		
		switch(opcion) {
		case 1:
			respuesta = "Aqui tienes tu pollo con patatas";
			break;
		case 2:
			respuesta = "Disfruta tu ensalada cesar";
			break;
		case 3:
			respuesta = "Traigo tu Hummus con crudites";
			break;
		case 4:
			respuesta = "Aqui esta tu PokeBowl";
			break;
		case 0:
			respuesta = "Aqui tienes la cuenta";
			break;
		default:
			respuesta = "Elige una opcion valida";
		}
		
		System.out.println(respuesta);
		entrada.close();
	}

}
