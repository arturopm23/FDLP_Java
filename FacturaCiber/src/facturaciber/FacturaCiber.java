package facturaciber;

import java.util.Scanner;

public class FacturaCiber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		int numFactEs = 43;
		int numFactEu = 59;
		int numFactEuRoi = 13;
		int numFactInt = 218;
		int newNumFact = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escoja una opcion:\n"
				+ "1. Española\n"
				+ "2. Europea sin ROI\n"
				+ "3. Europea con ROI\n"
				+ "4. Internacional\n"
				+ "5. Salir");
		opcion = entrada.nextInt();
		entrada.close();
		switch(opcion) {
		case 1:
			newNumFact = ++numFactEs;
			break;
		case 2:
			newNumFact = ++numFactEu;
			break;
		case 3:
			newNumFact = ++numFactEuRoi;
			break;
		case 4:
			newNumFact = ++numFactInt;
			break;
		}
		System.out.println("El nuevo numero de factura es " + newNumFact);
	}

}
