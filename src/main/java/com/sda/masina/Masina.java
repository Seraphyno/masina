package com.sda.masina;

public class Masina {

    private Caroserie caroserie;
    private Motor motor;
    private Roti roti;
    private int vitezaMaxima;
    private int vitezaCurenta;

    public Masina(Caroserie caroserie, Motor motor, Roti roti) {
        this.caroserie = caroserie;
        this.motor = motor;
        this.roti = roti;
        this.vitezaMaxima = (motor.getPutere() * roti.getDimensiune()
                * caroserie.getTip().getCoeficient()) / 1000;
    }

    public Tip getTipCaroserie() {
        return caroserie.getTip();
    }

    public double getMotor() {
        return motor.getCilindree();
    }

    public String getRoti() {
        return roti.getMaterial();
    }

    public boolean accelereaza(int vitezaDorita) {
        boolean ePosibilaAccelerarea = vitezaDorita <= vitezaMaxima;
        if (ePosibilaAccelerarea) {
            vitezaCurenta = vitezaDorita;
        }
        return ePosibilaAccelerarea;
    }

    public boolean franeaza(int vitezaDorita) {
        boolean ePosibilaFranarea = vitezaDorita <= vitezaCurenta;
        if (ePosibilaFranarea) {
            vitezaCurenta = vitezaDorita;
        }
        return ePosibilaFranarea;
    }
}
