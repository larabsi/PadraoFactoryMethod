import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BibliotecaRenovarTest {
    @Test
    void deveRenovarLivro() {
        IBiblioteca opcao = BibliotecaFactory.getInstance().obterOpcoes("Renovar");
        assertEquals("Renovacao feita com sucesso", opcao.executar());
    }

    @Test
    void deveCancelarRenovacao() {
        IBiblioteca opcao = BibliotecaFactory.getInstance().obterOpcoes("Renovar");
        assertEquals("Renovacao cancelada", opcao.cancelar());
    }
}
