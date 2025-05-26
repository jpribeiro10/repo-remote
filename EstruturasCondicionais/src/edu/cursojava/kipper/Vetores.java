package edu.cursojava.kipper;

import java.util.ArrayList;

public class Vetores {

	public static void main(String[] args) {
		
		//A primeira posição de um vetor é o indice 0

		/*int[] primeiraLista = {1,2,3,4,5,6,7,8,9,10};
		int[] meuNumero = new int[10];
		
		System.out.println(meuNumero.length);*/
		
		//ArrayList é uma forma de criar listas dinamicas
		
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("João Paulo");
		nomes.add("João Pedro");
		nomes.add("Gleiciany");
		
		
		
		System.out.println(nomes.get(0));

	}

}
