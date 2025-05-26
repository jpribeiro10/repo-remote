package edu.ifelseaula.kipper;

public class QuintoNumero {
    public static void main(String[] args) {
        int numero = 1001; // Começa do primeiro número maior que 1000
        int contador = 0;

        while (contador < 5) { // Encontrar 5 números que atendem à condição
            if (numero % 11 == 5) {
                contador++;
                System.out.println("Número " + contador + ": " + numero);
            }
            numero++; // Avança para o próximo número
        }
    }
}

