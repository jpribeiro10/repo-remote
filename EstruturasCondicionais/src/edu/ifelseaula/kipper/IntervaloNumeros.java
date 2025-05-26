package edu.ifelseaula.kipper;

import java.util.Scanner;

public class IntervaloNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();
        
        // Determinar os limites do intervalo
        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        System.out.println("Números inteiros no intervalo entre " + menor + " e " + maior + ":");
        for (int i = menor + 1; i < maior; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}

