import java.util.Scanner;

public class M4EX2_Arturo_Perez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaracion de variables
		String nom = "";
		int anys = 0;
		int salari = 0;
		
		//Inicio del metodo de entrada
		Scanner entrada = new Scanner(System.in);
		
		//Desarrollo
		System.out.println("Intodueix el teu nom:");
		nom = entrada.next();
		System.out.println("Quants anys portes a la empresa?");
		anys = entrada.nextInt();
		
		if (anys < 2) {
			salari = 25000;
		}
		else if ((anys >= 2) && (anys <= 4)) {
			salari = 35000;
		}
		else if ((anys > 4) && (anys <= 7)) {
			salari = 50000;
		}
		else if ((anys > 7) && (anys <=10)) {
			salari = 65000;
		}
		else if (anys > 10) {
			salari = 80000;
		}
		
		System.out.println("Hola " + nom + ", el teu salari es: " + salari);
		
		entrada.close();
	}

}
