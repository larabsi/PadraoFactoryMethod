public class BibliotecaRenovar implements IBiblioteca {

    @Override
    public String executar() {
        return "Renovacao feita com sucesso";
    }

    @Override
    public String cancelar() {
        return "Renovacao cancelada";
    }
}
