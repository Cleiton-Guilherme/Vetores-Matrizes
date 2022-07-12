package br.com.generation.VetoresMatrizes;

public class Exer01 {

	public static void main(String[] args) {
		
		int valor[] = {1,0,5,-2,-5,7};
		int soma;
		
		valor[3] = 100;
		soma = valor [0] +valor[1] +valor[5];
		for(int i = 0; i < valor.length; i++) {
			System.out.printf("Valor %d = %d", i+1,valor[i]);
			System.out.println("\n");
			
		}
       System.out.printf("Soma %d + %d + %d + %d", valor[0], valor[1], valor[5], soma);
	}

}
