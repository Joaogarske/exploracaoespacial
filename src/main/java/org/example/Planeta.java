package org.example;

import java.util.ArrayList;
import java.util.List;

public class Planeta {

    private final int posicao;
    private final List<Recursos> recursos;

    public Planeta(int posicao, List<Recursos> recursos) {
        this.posicao = posicao;
        this.recursos = new ArrayList<>(recursos);
    }

    public int getPosicao() {
        return posicao;
    }


    public List<Recursos> getRecursos() {
        return recursos;
    }


}
