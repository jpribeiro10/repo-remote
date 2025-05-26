package edu.ifelseaula.kipper;

import java.util.Scanner;

public class CodigoSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo, senha;

        System.out.print("Digite seu código (número positivo): ");
        codigo = scanner.nextInt();

        do {
            System.out.print("Digite sua senha (não pode ser igual ao código): ");
            senha = scanner.nextInt();

            if (senha == codigo) {
                System.out.println("Erro: A senha não pode ser igual ao código. Tente novamente.");
            }
        } while (senha == codigo);

        System.out.println("Cadastro realizado com sucesso!");
        scanner.close();
    }
}

