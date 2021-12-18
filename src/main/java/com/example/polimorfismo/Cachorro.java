package com.example.polimorfismo;

public class Cachorro extends  Lobo {
    protected String frase;
    protected  int Hora;
    protected  int minuto;
    protected  boolean dono;

    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }

    public void reagir(String frase){
        if (frase == "Toma comida" || frase == "Ola"){
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }
    public void reagir(int hora, int minuto){
        if (hora <= 12){
            System.out.println("Abanar");
        } else if (hora >= 18){
            System.out.println("Ignorar");
        } else {
            System.out.println("Abandonar e latir");
        }
    }
    public void reagir(boolean dono){
        if (dono){
            System.out.println("Abanar");
        } else
            System.out.println("Rosnar e latir");
        }
    }

