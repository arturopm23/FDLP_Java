package mates;

import java.util.Scanner;

public class Mates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int table = 0;
		int resultado = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Que tabla deseas usar?");
		table = entrada.nextInt();
		entrada.close();
		
		for (int i = 0; i <= 10; i++) {
			resultado = table * i;
			System.out.println(table + " x " + i + " = " + resultado);
		}
	}

}
