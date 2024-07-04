package org.example.Strategy;

public class ComportamentoAgressivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Moveu agressivamente");
    }
}
