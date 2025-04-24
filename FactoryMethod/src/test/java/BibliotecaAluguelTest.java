import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BibliotecaAluguelTest {
    @Test
    void deveAlugarLivro() {
        IBiblioteca opcao = BibliotecaFactory.obterOpcoes("Aluguel");
        assertEquals("Aluguel feito com sucesso", opcao.executar());
    }

    @Test
    void deveCancelarAluguel() {
        IBiblioteca opcao = BibliotecaFactory.obterOpcoes("Aluguel");
        assertEquals("Aluguel cancelado", opcao.cancelar());
    }
}
