package br.com.generation.VetoresMatrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		final int TAM =3;
		int matriz[][] = new int[TAM][TAM];
		int soma = 0;
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		
		//Entrada De Dados
		for (int linha = 0; linha < TAM; linha++) {
			for(int coluna = 0; coluna < TAM; coluna++) {
				System.out.println("Digite o número da matriz --> ");
				matriz[linha][coluna] = tc.nextInt();
				
				soma += matriz[linha][coluna];
				
			}
		}
		//Quebra De Linha
      System.out.println("");
      System.out.println("-------Matriz-------");
      
      // Saida De Dados
      for(int linha = 0; linha < TAM; linha++) {
    	  for(int coluna =0; coluna < TAM; coluna++) {
    		  System.out.println("["+matriz[linha][coluna]+"]");
    		  System.out.print("\t");
    	  }
    	  System.out.println("");
      }
      //Quebra De Linha
      System.out.println("---matriz---");
      System.out.println("");
      
      //Saída De Dados Da Soma
      System.out.println("A soma de todos os valores é de: "+soma);
      soma = matriz[0][0]+matriz[1][1]+matriz[2][2];
      System.out.println("Soma da principal diagonal é de: "+soma);
      tc.close();
	}

}
