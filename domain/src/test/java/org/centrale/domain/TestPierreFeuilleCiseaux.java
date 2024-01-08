package org.centrale.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPierreFeuilleCiseaux {

    @Test 
    public void jeuEgalite(){
        Hand p = new Pierre();
        Hand f = new Feuille();
        Hand c = new Ciseaux();
        Assertions.assertEquals(p.playWith(new Pierre()), 0);
        Assertions.assertEquals(f.playWith(new Feuille()), 0);
        Assertions.assertEquals(c.playWith(new Ciseaux()), 0);
    }

    @Test
    public void jeuPerdu(){
        Hand p = new Pierre();
        Hand f = new Feuille();
        Hand c = new Ciseaux();
        Assertions.assertEquals(p.playWith(new Feuille()), 1);
        Assertions.assertEquals(f.playWith(new Ciseaux()), 1);
        Assertions.assertEquals(c.playWith(new Pierre()), 1);
    }

    @Test
    public void jeuGagne(){
        Hand p = new Pierre();
        Hand f = new Feuille();
        Hand c = new Ciseaux();
        Assertions.assertEquals(p.playWith(new Ciseaux()), -1);
        Assertions.assertEquals(f.playWith(new Pierre()), -1);
        Assertions.assertEquals(c.playWith(new Feuille()), -1);
    }

}
