package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NizTest {

    @Test
    void dodajElement() {
        Niz n=new Niz(5);
        n.dodajElement(6);
        int[] pom={0,0,0,0,0,6};
        assertArrayEquals(n.getNiz(), pom);
    }

    @Test
    void setVelicina() {
        Niz n=new Niz(1);
        assertThrows(IllegalArgumentException.class, ()->{ n.setVelicina(-10);});
    }

  /*  @Test
    void ispisiNiz() {
        Niz n=new Niz(4);
        assertE
    }*/
}