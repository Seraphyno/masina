package com.sda.masina;

public class Motor {
    private String producator;
    private double cilindree;
    private int putere;

    public Motor(String producator, double cilindree, int putere) {
        this.producator = producator;
        this.cilindree = cilindree;
        this.putere = putere;
    }

    public String getProducator() {
        return producator;
    }

    public double getCilindree() {
        return cilindree;
    }

    public int getPutere() {
        return putere;
    }
}
