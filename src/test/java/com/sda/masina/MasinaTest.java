package com.sda.masina;


import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MasinaTest {

    @Mock
    public Caroserie caroserie;
    @Mock
    public Motor motor;
    @Mock
    public Roti roti;

    private Masina target;

    @Before
    public void setup() {
        when(motor.getPutere()).thenReturn(102);
        when(roti.getDimensiune()).thenReturn(16);
        when(caroserie.getTip()).thenReturn(Tip.HATCHBACK);

        target = new Masina(caroserie, motor, roti);
    }

    @Test
    public void testAccelerare() {
        assertTrue(target.accelereaza(200));
    }

    @Test
    public void testFranare() {
        target.accelereaza(190);
        assertTrue(target.franeaza(100));
    }
}