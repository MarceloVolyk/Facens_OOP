package aula_construtor;

public class MaiorNumero {

	public static void main(String[] args) {

		int[] vet = {41, 6, 12, 44, 62, 6, 22, 36, 99, 1};

		int max = vet[0];

		for (int i = 0; i < vet.length; i++) {
		    if (vet[i] > max) {
		      max = vet[i];
		    }
		}
		System.out.println(max);
	}

}
