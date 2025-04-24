import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class BibliotecaFactoryTest {
    @Test
    void deveRetornarExcecaoParaOpcaoInexistente() {
        try {
            IBiblioteca opcao = BibliotecaFactory.obterOpcoes("Doar");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Opcao inexistente", e.getMessage());
        }
    }

}
