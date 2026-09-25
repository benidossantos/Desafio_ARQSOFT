package padroescriacao.unificado;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodTest {

    @Test
    void deveRetornarSempreAMesmaInstancia() {
        assertSame(FactoryMethod.getInstance(), FactoryMethod.getInstance());
    }

    @Test
    void deveRetornarFabricaGraduacao() {
        assertTrue(FactoryMethod.getInstance().obterFabrica("Graduacao") instanceof FabricaGraduacao);
    }

    @Test
    void deveRetornarFabricaPosGraduacao() {
        assertTrue(FactoryMethod.getInstance().obterFabrica("PosGraduacao") instanceof FabricaPosGraduacao);
    }

    @Test
    void deveRetornarExcecaoParaFabricaInexistente() {
        try {
            FactoryMethod.getInstance().obterFabrica("Mestrado");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fábrica inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFabricaInvalida() {
        try {
            FactoryMethod.getInstance().obterFabrica("Invalida");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fábrica inválida", e.getMessage());
        }
    }
}
