package com.sda.masina;

import java.util.Date;

public class Caroserie {
    private String culoare;
    private Tip tipCaoserie;
    private Date anProductie;

    public Caroserie(String culoare, Tip tipCaoserie, Date anProductie) {
        this.culoare = culoare;
        this.tipCaoserie = tipCaoserie;
        this.anProductie = anProductie;
    }

    public String getCuloare() {
        return culoare;
    }

    public Tip getTip() {
        return tipCaoserie;
    }

    public Date getAnProductie() {
        return anProductie;
    }
}
