package org.example;

import java.util.ArrayList;
import java.util.List;



public class Nave {

    private int quantidadeDeCombustivel;
    private int posicao;

    private List<Recursos> recursosNave = new ArrayList<>();

    public Nave(int quantidadeDeCombustivel) {
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
        this.posicao = 0;
    }

    public int getQuantidadeDeCombustivel() {
        return quantidadeDeCombustivel;
    }


    public void explorar(Planeta planeta){

        int qtdCombustivel = getQuantidadeDeCombustivel();
        int posicaoNave = getPosicao();

        for(int posicao = getPosicao(); posicao < planeta.getPosicao(); posicao++){
            posicaoNave +=1;
            if(qtdCombustivel >= 3){
                qtdCombustivel -= 3;
            }
            if(qtdCombustivel < 3 && posicao!= 0){
                break;
            }
            if(planeta.getPosicao() == posicao){
                recebeRecursos(planeta.getRecursos());
            }

        }
        while(posicaoNave != 0){
            if(qtdCombustivel >= 3){
                qtdCombustivel -=3;
            }else if(qtdCombustivel < 3 && posicaoNave != 0) break;
            posicaoNave -=1;
        }
        setPosicao(posicaoNave);

    }



    public void explorar(List<Planeta> planeta) {
        //variaveis para utilizar
        int maiorPosicao = 0;
        int qtdCombustivel = getQuantidadeDeCombustivel();
        int posicaoNave = getPosicao();

        for(Planeta planetas : planeta) {
            if (planetas.getPosicao() > maiorPosicao) {
                maiorPosicao = planetas.getPosicao();
            }
        }
        maiorPosicao += 1;
        for(int posicao = posicaoNave; posicao < maiorPosicao; posicao++){
            posicaoNave +=1;
             if(qtdCombustivel >= 3){
                qtdCombustivel -= 3;
             }
            if (qtdCombustivel < 3) break;
            if(planeta.get(0).getPosicao() == posicao){
                     recebeRecursos(planeta.get(0).getRecursos());
                     planeta.remove(0);
             }

        }
        while(posicaoNave != 0){
            if(qtdCombustivel >= 3){
                qtdCombustivel -=3;
            }else if(qtdCombustivel < 3 && posicaoNave != 0){
                break;
            }
            posicaoNave -=1;
        }
       setPosicao(posicaoNave);

    }
    public int getPosicao() {
        return posicao;
    }


    public void recebeRecursos(List<Recursos> recurso) {
       recursosNave.addAll(recurso);
    }


    public double calcularValorPorPesoRecursos() {
        double valorPorPeso = 0.0;
        for (Recursos recurso : recursosNave) {
            valorPorPeso += (double) recurso.getValor() / recurso.getPeso();
        }
        return valorPorPeso;
    }

    public int calcularValorTotalRecursos() {
        int valorTotal = 0;
        for (Recursos recurso : recursosNave) {
            valorTotal += recurso.getValor();
        }
        return valorTotal;
    }


    public List<Recursos> getRecursos() {
        return recursosNave;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
}
