package m4extra2_arturo_perez;

import java.util.Scanner;

public class M4EXTRA2_Arturo_Perez {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int nombre = 0;
			String nombreString ="";
			char desenes = '0';
			char unitats = ' ';
			String unitatsText = "";
			String desenesText = "";
			
			Scanner inputUsuari = new Scanner(System.in);
			
			// demanar usuari un numero entre 0 i 99
			System.out.println("Introdueix un nombre del 0 al 99 inclosos: ");
			nombre =  inputUsuari.nextInt();
			inputUsuari.close();
			
			//nombreString = nombre + "";
			nombreString = String.valueOf(nombre);
			
			//fracccionar valor charAt()
			if (nombre > 9) {
				desenes = nombreString.charAt(0);
				unitats = nombreString.charAt(1);
			
			} else {
				unitats = nombreString.charAt(0);		
			}
			
			switch(unitats) {
				case '0':
					unitatsText = "cero";
					break;
				case '1':
					unitatsText = "uno";
					break;
				case '2':
					unitatsText = "dos";
					break;
				case '3':
					unitatsText = "tres";
					break;
				case '4':
					unitatsText = "quatro";
					break;
				case '5':
					unitatsText = "cinco";
					break;
				case '6':
					unitatsText = "seis";
					break;
				case '7':
					unitatsText = "siete";
					break;
				case '8':
					unitatsText = "ocho";
					break;
				case '9':
					unitatsText = "nueve";
					break;				
			}
			
			switch(desenes) {
			case '0':
				desenesText = "";
				break;
			case '1':
				desenesText = "";
				switch (unitats) {
					case '0':
						unitatsText = "diez";
						break;
					case '1':
						unitatsText = "once";
						break;
					case '2':
						unitatsText = "doce";
						break;
					case '3':
						unitatsText = "trece";
						break;
					case '4':
						unitatsText = "catorce";
						break;
					case '5':
						unitatsText = "quince";
						break;
					default:
						desenesText = "dieci";			
				}
				break;
			case '2':
				if (unitats == '0') {
					desenesText = "veinte";
					unitatsText = "";
				} else {
					desenesText = "veinti";
				}
				break;
			case '3':
				if (unitats == '0') {
					desenesText = "treinta";
					unitatsText = "";
				} else {
					desenesText = "treinta y ";
				}
				break;
			case '4':
				if (unitats == '0') {
					desenesText = "cuarenta";
					unitatsText = "";
				} else {
					desenesText = "cuarenta y ";
				}
				break;
			case '5':
				if (unitats == '0') {
					desenesText = "cincuenta";
					unitatsText = "";
				} else {
					desenesText = "cincuenta y ";
				}
				break;
			case '6':
				if (unitats == '0') {
					desenesText = "sesenta";
					unitatsText = "";
				} else {
					desenesText = "sesenta y ";
				}
				break;
			case '7':
				if (unitats == '0') {
					desenesText = "setenta";
					unitatsText = "";
				} else {
					desenesText = "setenta y ";
				}
				break;
			case '8':
				if (unitats == '0') {
					desenesText = "ochenta";
					unitatsText = "";
				} else {
					desenesText = "ochenta y ";
				}
				break;
			case '9':
				if (unitats == '0') {
					desenesText = "noventa";
					unitatsText = "";
				} else {
					desenesText = "noventa y ";
				}
				break;
			}
			
		
			System.out.println(desenesText + unitatsText);		
			
		}

	}