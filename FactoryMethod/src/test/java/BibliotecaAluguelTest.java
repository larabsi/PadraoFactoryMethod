import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BibliotecaAluguelTest {
    @Test
    void deveAlugarLivro() {
        IBiblioteca opcao = BibliotecaFactory.getInstance().obterOpcoes("Alugar");
        assertEquals("Aluguel feito com sucesso", opcao.executar());
    }

    @Test
    void deveCancelarAluguel() {
        IBiblioteca opcao = BibliotecaFactory.getInstance().obterOpcoes("Alugar");
        assertEquals("Aluguel cancelado", opcao.cancelar());
    }
}
