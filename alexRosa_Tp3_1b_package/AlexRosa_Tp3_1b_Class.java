package alexRosa_Tp3_1b_package;

public class AlexRosa_Tp3_1b_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]ordenados = OrdenarNumeros(12, 98, 52, "ac");
		
		for(int indice = 0; indice < ordenados.length; indice++) {
			System.out.println(ordenados[indice]);
		}
	}
	
	private static int[] OrdenarNumeros(int num1, int num2, int num3, String orden) {
		int[] numerosOrdenados = new int[3];
		numerosOrdenados[0] = num1;
		numerosOrdenados[1] = num2;
		numerosOrdenados[2] = num3;
		
		if(orden == "des") {
			for(int i = 0; i < numerosOrdenados.length ; i++) {
				for(int j = i + 1; j < numerosOrdenados.length ; j++) {
					if(numerosOrdenados[i] < numerosOrdenados[j]) {
						int auxiliar = numerosOrdenados[i];
						numerosOrdenados[i] = numerosOrdenados[j];
						numerosOrdenados[j] = auxiliar;
					}
				}
			}
		}
		if(orden == "ac") {
			for(int i = 0; i < numerosOrdenados.length ; i++) {
				for(int j = i + 1; j < numerosOrdenados.length ; j++) {
					if(numerosOrdenados[i] > numerosOrdenados[j]) {
						int auxiliar = numerosOrdenados[i];
						numerosOrdenados[i] = numerosOrdenados[j];
						numerosOrdenados[j] = auxiliar;
					}
				}
			}
		}
		
		return numerosOrdenados;
	}

}
