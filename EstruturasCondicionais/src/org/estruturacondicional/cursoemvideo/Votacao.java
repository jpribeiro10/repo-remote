package org.estruturacondicional.cursoemvideo;

import java.util.Scanner;

public class Votacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int anoCorrente = 2025;
		
		System.out.println("Informe seu ano de nascimento: ");
		int nasc = scan.nextInt();
		
		int idade = anoCorrente - nasc;
		
		if (idade < 16) {
			System.out.println("Não vota");
			if  (idade >= 16 ){
				System.out.println("Pode votar");
			}else { 
				System.out.println("Opcional");
			}
		}

	}

}
