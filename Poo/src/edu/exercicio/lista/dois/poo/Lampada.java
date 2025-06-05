package edu.exercicio.lista.dois.poo;

public class Lampada {
    private boolean ligada;

    // Construtor
    public Lampada() {
        this.ligada = false; // A lâmpada começa desligada
    }

    // Método para ligar a lâmpada
    public void ligar() {
        if (!ligada) {
            ligada = true;
            System.out.println("A lâmpada foi ligada.");
        } else {
            System.out.println("A lâmpada já está ligada.");
        }
    }

    // Método para desligar a lâmpada
    public void desligar() {
        if (ligada) {
            ligada = false;
            System.out.println("A lâmpada foi desligada.");
        } else {
            System.out.println("A lâmpada já está desligada.");
        }
    }

    // Método para verificar o estado da lâmpada
    public boolean estaLigada() {
        return ligada;
    }
}

