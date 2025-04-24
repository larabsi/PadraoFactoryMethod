import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BibliotecaRenovarTest {
    @Test
    void deveRenovarLivro() {
        IBiblioteca opcao = BibliotecaFactory.obterOpcoes("Renovacao");
        assertEquals("Renovacao feita com sucesso", opcao.executar());
    }

    @Test
    void deveCancelarRenovacao() {
        IBiblioteca opcao = BibliotecaFactory.obterOpcoes("Renovacao");
        assertEquals("Renovacao cancelada", opcao.cancelar());
    }
}
