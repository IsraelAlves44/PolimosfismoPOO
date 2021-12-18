package com.example.polimorfismo;

public class Lobo  extends Mamifero{
    @Override
    public void locomover() {
        System.out.println("Som de Mamifero");
    }

    @Override
    public void emitirSom() {
        System.out.println("Auuuuuuuuuuuuu");
    }
}
