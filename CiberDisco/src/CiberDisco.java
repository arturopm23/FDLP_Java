import java.util.Scanner;

public class CiberDisco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  > Mayor que
		 *  < Menor que
		 *  >= Mayor o igual que
		 *  <= Menor o igul que
		 *  == Igual
		 *  != Diferente
		 *  && and y // condicion1 ==true && condicion2 == true, el total es  true
		 *  || or/pipe o //condicon1 == true || condicion2 == false, el total es true
		 *  El resultado será boolean
		 */
		
		int num1 = 0;
		int num2 = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dime un numero");
		num1 = entrada.nextInt();
		
		System.out.println ("Dime otro numero");
		num2 = entrada.nextInt();
		
		System.out.println("Operador >: " + (num1 > num2));
		System.out.println("Operador <: " + (num1 < num2));
		System.out.println("Operador >=: " + (num1 >= num2));
		System.out.println("Operador <=: " + (num1 <= num2));
		System.out.println("Operador ==: " + (num1 == num2));
		System.out.println("Operador !=: " + (num1 != num2));
		
		entrada.close();
	}

}
