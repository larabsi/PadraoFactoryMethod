import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BibliotecaDevolverTest {
    @Test
    void deveDevolverLivro() {
        IBiblioteca opcao = BibliotecaFactory.obterOpcoes("Devolucao");
        assertEquals("Devolucao feita com sucesso", opcao.executar());
    }

    @Test
    void deveCancelarDevolucao() {
        IBiblioteca opcao = BibliotecaFactory.obterOpcoes("Devolucao");
        assertEquals("Devolucao cancelada", opcao.cancelar());
    }
}
