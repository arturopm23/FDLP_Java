package ecommerce;

import java.util.Scanner;

public class Ecommerce {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        int newNumFact = 0;
        int opcion = 0;
        int[] numFact = {43,59,13,218};
        Scanner entrada = new Scanner(System.in);

        do {
		        System.out.println("Que tipo de factura deseas?\n"
		                + "1. Española\n"
		                + "2. Europea sin ROI\n"
		                + "3. Europea con ROI\n"
		                + "4. Internacional\n");
		
		        opcion = entrada.nextInt();
		        
		        if (opcion != 0) {
		        newNumFact = ++numFact [(opcion -1)];
		        /*switch(opcion) {
		        case 1:
		            newNumFact = ++numFact[0];
		            break;
		        case 2:
		        	newNumFact = ++numFact[1];
		            break;
		        case 3:
		            nnewNumFact = ++numFact[2];
		            break;
		        case 4:
		        	newNumFact = ++numFact[3];
		            break;
		        }*/
		        }
		        System.out.println("El nuevo numero de factura és " + newNumFact);
    } 
        while(opcion != 0);
        System.out.println("Adios");
        entrada.close();
	}

}