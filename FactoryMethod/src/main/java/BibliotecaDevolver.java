public class BibliotecaDevolver implements IBiblioteca {

    @Override
    public String executar() {
        return "Devolucao feita com sucesso";
    }

    @Override
    public String cancelar() {
        return "Devolucao cancelada";
    }
}