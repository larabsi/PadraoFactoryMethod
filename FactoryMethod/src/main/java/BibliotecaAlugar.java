public class BibliotecaAlugar  implements IBiblioteca {

    @Override
    public String executar() {
        return "Aluguel feito com sucesso";
    }

    @Override
    public String cancelar() {
        return "Aluguel cancelado";
    }
}
