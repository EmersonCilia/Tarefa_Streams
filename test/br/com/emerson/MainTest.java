package br.com.emerson;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testFiltrarMulheres() {
        List<Pessoas> pessoas = Arrays.asList(
                new Pessoas("Maria", "Feminino"),
                new Pessoas("João", "Masculino"),
                new Pessoas("Ana", "Feminino")
        );

        List<Pessoas> resultado = Main.filtrarMulheres(pessoas);

        assertEquals(2, resultado.size());
        assertTrue(resultado.stream().allMatch(p -> p.getSexo().equalsIgnoreCase("Feminino")));
    }
}
