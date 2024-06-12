package arreglo1Java;

public class arregloClase3 {

	public static void main(String[] args) {
		int[] numeros = {5,7,8,9,2};
		int minimo = numeros[0];
				
		for (int numero : numeros) {
			if (numero > minimo);
			    minimo=numero;
		}

	}

	 System.out.println("El valor minimo en el array es:" + minimo);
	
}
