
import org.example.Nave;
import org.example.Planeta;
import org.example.Recursos;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class ExploracaoEspacialTest {
     @Test
     public void deveFicarADerivaQuandoFaltarCombustivelParaIrAteUmPlaneta(){
         int posicaoEsperada = 3;
         Nave milleniumFalcon = new Nave(9);
         Planeta tatooine = new Planeta(4, new ArrayList<>());

         milleniumFalcon.explorar(tatooine);
         int posicaoResultante = milleniumFalcon.getPosicao();

         Assert.assertEquals(posicaoEsperada, posicaoResultante);




     }


    @Test
    public void  deveTerValorTotalZeradoQuandoNaoExistirNenhumRecurso(){

        Nave nave = new Nave(100);

        Recursos agua = new Recursos(30,20);
        Recursos ferro = new Recursos(20,50);
        List<Recursos> recursos = new ArrayList<>();
        recursos.add(agua);
        recursos.add(ferro);
        int valorEsperado = 0;

        Planeta planeta1 = new Planeta(4, new ArrayList<>());
        Planeta planeta2 = new Planeta(8, new ArrayList<>());
        Planeta planeta3 = new Planeta(10,new ArrayList<>());



        List<Planeta> planetas = new ArrayList<>();
        planetas.add(planeta1);
        planetas.add(planeta2);
        planetas.add(planeta3);
        nave.explorar(planetas);

        int valorZero = nave.calcularValorTotalRecursos();
        Assert.assertEquals(valorEsperado,valorZero);










    }


    @Test
    public void deveTerValorTotalQuandoExistirRecursosNoPlaneta(){

        Nave nave = new Nave(100);
        int valorEsperado = 150;
        Recursos agua = new Recursos(30,20);
        Recursos ferro = new Recursos(20,50);
        List<Recursos> recursos = new ArrayList<>();
        recursos.add(agua);
        recursos.add(ferro);


        Planeta planeta1 = new Planeta(4, recursos);
        Planeta planeta2 = new Planeta(8, recursos);
        Planeta planeta3 = new Planeta(10,recursos);



        List<Planeta> planetas = new ArrayList<>();
        planetas.add(planeta1);
        planetas.add(planeta2);
        planetas.add(planeta3);
        nave.explorar(planetas);

        int valorTotal = nave.calcularValorTotalRecursos();
        Assert.assertEquals(valorEsperado,valorTotal);
    }


    @Test
    public void deveTerValorPorPesoZeradoQuandoNaoExistirNenhumRecurso(){

        Nave nave = new Nave(100);
        double valorEsperado = 0;
        Recursos agua = new Recursos(30,20);
        Recursos ferro = new Recursos(20,50);
        List<Recursos> recursos = new ArrayList<>();
        recursos.add(agua);
        recursos.add(ferro);


        Planeta planeta1 = new Planeta(4, new ArrayList<>());
        Planeta planeta2 = new Planeta(8, new ArrayList<>());
        Planeta planeta3 = new Planeta(10,new ArrayList<>());



        List<Planeta> planetas = new ArrayList<>();
        planetas.add(planeta1);
        planetas.add(planeta2);
        planetas.add(planeta3);
        nave.explorar(planetas);


        double valorZero = nave.calcularValorPorPesoRecursos();
        Assert.assertEquals(valorEsperado,valorZero,0.01);

    }



    @Test
    public void  deveTerValorPorPesoQuandoExistirRecursosNoPlaneta(){


        Nave nave = new Nave(100);
        double valorEsperado = 5.7;
        Recursos agua = new Recursos(30,20);
        Recursos ferro = new Recursos(20,50);
        List<Recursos> recursos = new ArrayList<>();
        recursos.add(agua);
        recursos.add(ferro);


        Planeta planeta1 = new Planeta(4, recursos);
        Planeta planeta2 = new Planeta(8, recursos);
        Planeta planeta3 = new Planeta(10,recursos);


        List<Planeta> planetas = new ArrayList<>();
        planetas.add(planeta1);
        planetas.add(planeta2);
        planetas.add(planeta3);
        nave.explorar(planetas);

        double valorTotalPeso = nave.calcularValorPorPesoRecursos();
        Assert.assertEquals(valorEsperado,valorTotalPeso,0.01);
    }



    @Test
    public void testeGeralRecursos(){

         Recursos recursosTest = new Recursos(20,30);
         System.out.println(recursosTest.getPeso());
         System.out.println(recursosTest.getValor());


    }
    @Test
    public void testeGeralPlaneta(){
        Recursos recursosTest = new Recursos(20,30);
        List<Recursos> listRecursos = new ArrayList<>();
        listRecursos.add(recursosTest);
         Planeta planetaTest = new Planeta(4,listRecursos);
         System.out.println(planetaTest.getPosicao());
         System.out.println(planetaTest.getRecursos());

    }
    @Test
    public void testGeralNave(){

         Nave falcon = new Nave(9);
         System.out.println(falcon.getPosicao());
         System.out.println(falcon.getQuantidadeDeCombustivel());

    }



}
