package org.example.Strategy;

public class ComportamentoNormal implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Moveu normalmente");
    }
}
