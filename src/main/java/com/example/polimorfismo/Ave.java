package com.example.polimorfismo;

public class Ave extends Animal {
    private String corPena;

    // Sobreposicao
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

    public void fazerNinho(){
        System.out.println("Fazendo Ninho");
    }

    // Metodos Especiais

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
