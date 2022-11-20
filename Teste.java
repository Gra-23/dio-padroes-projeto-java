package digital.innovation.one.padrõesProjeto;

import digital.innovation.one.padrõesProjeto.singleton.Singleton;
import digital.innovation.one.padrõesProjeto.singleton.SingletonHolder;
import digital.innovation.one.padrõesProjeto.strategy.ComportamentoAgachar;
import digital.innovation.one.padrõesProjeto.strategy.ComportamentoFrente;
import digital.innovation.one.padrõesProjeto.strategy.ComportamentoReverso;
import digital.innovation.one.padrõesProjeto.strategy.Robo;

import java.awt.*;

public class Teste {

    public static void main(String[] args) {

        //Singleton

        Singleton singleton = Singleton.getInstancia();
        System.out.println(singleton);
        singleton = Singleton.getInstancia();
        System.out.println(singleton);

        SingletonHolder holder = SingletonHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonHolder.getInstancia();
        System.out.println(holder);



        //Strategy

        ComportamentoFrente frente = new ComportamentoFrente();
        ComportamentoReverso reverso = new ComportamentoReverso();
        ComportamentoAgachar agachar = new ComportamentoAgachar();

        Robo robo = new Robo();
        robo.setComportamento(frente);
        robo.mover();
        robo.mover();
        robo.setComportamento(agachar);
        robo.mover();
        robo.setComportamento(reverso);
        robo.mover();
        robo.mover();
    }




}
