package arreglo1Java;

public class arregloClase1 {

	public static void main(String[] args) {
		int[] numeros = {10,20,30,40,50};
		
		System.out.println("Elementos en posiciones impares:");
		for (int i = 1;i < numeros.length; i += 2) {
			System.out.print(numeros[i] + " ");
		}

	}

}
