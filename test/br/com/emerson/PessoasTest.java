package br.com.emerson;

import org.junit.Test;
import static org.junit.Assert.*;

public class PessoasTest {

    @Test
    public void testGetSetNomeSexo() {
        Pessoas p = new Pessoas();
        p.setNome("Carlos");
        p.setSexo("Masculino");

        assertEquals("Carlos", p.getNome());
        assertEquals("Masculino", p.getSexo());
    }

    @Test
    public void testConstructor() {
        Pessoas p = new Pessoas("Luiza", "Feminino");

        assertEquals("Luiza", p.getNome());
        assertEquals("Feminino", p.getSexo());
    }
}