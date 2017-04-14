package org.coursera.ita.palavras.embaralhadas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		imprimeHorizontal(11);
	}

	public static void imprimeHorizontal(int quantidade) {
	    int[] vetor = new int[quantidade];
	    Scanner leia = new Scanner(System.in);
	    for (int i = 0; i < quantidade; i++) {
	        System.out.print("Digite o número " + (i + 1) + ": ");
	        vetor[i] = leia.nextInt();
	    }    
	    // aqui eu troco os indices conforme o enunciado
	    for (int i = 0; i < quantidade; i += 1) {
	        int aux = vetor[i];
	        vetor[i] = vetor[i + 1];
	        vetor[i + 1] = aux;
	    }
	    // imprime o vetor
	    for (int i = 0; i < quantidade; i++)
	      System.out.print(vetor[i] + "   ");
	}
}
