package com.sda.masina;

public enum Tip {

    HATCHBACK(123),
    BERLINA(130),
    BREAK(127);

    private int coeficient;

    Tip(int coeficient) {
        this.coeficient = coeficient;
    }

    public int getCoeficient() {
        return coeficient;
    }
}
