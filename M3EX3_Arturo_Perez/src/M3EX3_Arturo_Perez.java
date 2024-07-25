import java.util.Scanner;

public class M3EX3_Arturo_Perez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaracion de variables
		int nota1 = 0;
		int nota2 = 0;
		int nota3 = 0;
		float notaMedia = 0f ;
		
		//Declaracion de metodos de entrda
		Scanner entrada = new Scanner(System.in);

		//Recogida de datos
		System.out.println("Introduzca la primera nota");
		nota1 = entrada.nextInt();
		System.out.println("Introduzca la segunda nota");
		nota2 = entrada.nextInt();
		System.out.println("Introduzca la tercera nota");
		nota3 = entrada.nextInt();
		
		//Resultado
		notaMedia = (float) (nota1 + nota2 + nota3) /3;
		System.out.println("La media es " + notaMedia);
		
		//Cerramos scanner
		entrada.close();
		
		}
}
