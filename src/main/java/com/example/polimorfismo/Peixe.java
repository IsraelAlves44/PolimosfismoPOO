package com.example.polimorfismo;

public class Peixe extends Animal{
    private String corEscama;

    // Metodos Abstratos

    @Override
    public void locomover() {
        super.locomover();
    }

    @Override
    public void alimentar() {
        super.alimentar();
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
    }
    public void soltarBolha(){
        System.out.println("Soltando Bolha");
    }
    // Metodos Especiais


    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
