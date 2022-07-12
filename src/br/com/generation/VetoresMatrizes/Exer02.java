package br.com.generation.VetoresMatrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		final int MCB = 3;
		int matriz[][] = new int [MCB][MCB];
	    int maiorDez = 0;
	    Locale.setDefault(Locale.US);
	    Scanner tc = new Scanner(System.in);
	    
	    for(int linha = 0; linha < MCB; linha++) {
	    	for(int coluna = 0; coluna < MCB; coluna++) {
	    		System.out.println("Digite um valor: ");
	    		matriz[linha][coluna] = tc.nextInt();
	    		if(matriz[linha][coluna]>10) {
	    			maiorDez++;
	    		}
	    	}
	    }
       System.out.println();
       for(int linha = 0; linha < MCB; linha++) {
    	   for(int coluna = 0; coluna < MCB; coluna++) {
    		   System.out.println("["+matriz[linha][coluna]+"]\t");
    		   
    	   }
    	   System.out.println();
       }
       System.out.println(maiorDez>1?"\nValores que 10 existentes: " +maiorDez:(maiorDez==1)?"\nExiste apenas um valor maior que dez":"\nNão existe valor maior que dez");
       tc.close();
	}

}
