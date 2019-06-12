package com.sda.masina;

public class Roti {
    private int numar;
    private int dimensiuneRoata;
    private String material;

    public Roti(int numar, int dimensiuneRoata, String material) {
        this.numar = numar;
        this.dimensiuneRoata = dimensiuneRoata;
        this.material = material;
    }

    public int getNumar() {
        return numar;
    }

    public int getDimensiune() {
        return dimensiuneRoata;
    }

    public String getMaterial() {
        return material;
    }
}
