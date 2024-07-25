package m4ex6_arturo_perez;

import java.util.Scanner;

public class M4EX6_Arturo_Perez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int plato = 0;
		int intolerancias = 0;
		String respuesta = "";
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Tiene alguna preferencia y/o intolerancia ?\n"
				+ "1. Soy vegano\n"
				+ "2. Soy celiaco\n"
				+ "3. Soy intolerante a la lactosa\n"
				+ "4. No");
		intolerancias = entrada.nextInt();
		
		System.out.println("Que plato quieres?\n"
				+ "1. Carne\n"
				+ "2. Pasta (con gluten)\n"
				+ "3. Risotto (con lactosa)");
		plato = entrada.nextInt();

		entrada.close();
	
	switch(plato) {
		case 1:
			respuesta = (intolerancias != 1) ? "perfecto, tome su carne" : "Usted no puede comer este plato";
		break;
		case 2:
			respuesta = (intolerancias != 2) ? "perfecto, tome su pasta" : "Usted no puede comer este plato";
		break;
		case 3:
			respuesta = (intolerancias != 3) ? "perfecto, tome su risotto" : "Usted no puede comer este plato";
		break;
		default:
			respuesta = "ERROR, Escoja un plato del menu";
	}
	System.out.println(respuesta);
}
}