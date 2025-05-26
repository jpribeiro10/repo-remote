package edu.ifelseaula.kipper;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número para ver sua tabuada: ");
        int x = scanner.nextInt();

        System.out.println("Tabuada do " + x + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " x " + i + " = " + (x * i));
        }

        scanner.close();
    }
}

