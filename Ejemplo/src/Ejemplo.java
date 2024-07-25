
import java.util.Scanner;

public class Ejemplo {

		public static void main(String[] args) {
		
		int suma = 0;	
		int numero = 0;
		int numero2 = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("indica un numero? ");
        numero = sc.nextInt();
        
        System.out.print("indica otro numero? ");
        numero2 = sc.nextInt();
         
        sc.close();
	  
        for (int i = numero;  i <= numero2 ; i++ ) {
        	   suma = suma + (i);
        
		        if (i < numero2) {
		            System.out.print(i + "+");
		        } else {
		            System.out.print(numero2 + " =" + suma);
		        }
		    }
		    
		}
} 
