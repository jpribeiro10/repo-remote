package edu.ifelseaula.kipper;

import java.util.Scanner;

public class ProdutoESomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int somaPares = 0;
        int produtoImpares = 1;
        boolean temImpar = false; // Para garantir que há pelo menos um número ímpar

        System.out.println("Digite números inteiros positivos (0 ou negativo para sair):");

        while (true) {
            numero = scanner.nextInt();
            
            if (numero <= 0) {
                break; // Encerra o loop se o número for 0 ou negativo
            }

            if (numero % 2 == 0) {
                somaPares += numero; // Soma dos pares
            } else {
                produtoImpares *= numero; // Produto dos ímpares
                temImpar = true;
            }
        }

        scanner.close();

        // Se nenhum número ímpar for inserido, o produto deve ser 0 para evitar resultados errados
        if (!temImpar) {
            produtoImpares = 0;
        }

        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Produto dos números ímpares: " + produtoImpares);
    }
}

