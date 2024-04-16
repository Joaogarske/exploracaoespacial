package org.example;

public class Recursos {


    private final int valor;
    private final int peso;

    public Recursos(int valor, int peso) {

        this.valor = valor;
        this.peso = peso;
    }



    public int getValor() {
        return valor;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Recursos{" +
                ", valor=" + valor +
                ", peso=" + peso +
                '}';
    }
}
