package orden_arturo_perez;

import java.util.ArrayList;

public class Orden_Arturo_Perez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroCambio = 0;
		ArrayList<Integer> numeros = new ArrayList<Integer>(6);

		numeros.add(4);
		numeros.add(8);
		numeros.add(1);
		numeros.add(5);
		numeros.add(2);
		numeros.add(6);
		
		for (int i = 0; i < (numeros.size() - 1) ; i++) {
			for (int j = 0; j < (numeros.size() - i - 1); j++) {
				if (numeros.get(j) > numeros.get(j + 1)) {
					numeroCambio = numeros.get(j);
					numeros.set( j , numeros.get(j + 1));
					numeros.set( j + 1  , numeroCambio);
			}
			}
		}
		System.out.println("La lista ordenada de manera ascendente es:\n"
				+ ""+ numeros);
	}
}
