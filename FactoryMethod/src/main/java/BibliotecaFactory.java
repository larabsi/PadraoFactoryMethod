public class BibliotecaFactory {
    public static BibliotecaFactory instance;

    private BibliotecaFactory() {
    }

    public static BibliotecaFactory getInstance() {
        if (instance == null) {
            instance = new BibliotecaFactory();
        }

        return instance;
    }

    public IBiblioteca obterOpcoes (String opcoes) {
        if ("Renovar".equalsIgnoreCase(opcoes)) {
            return new BibliotecaRenovar();
        } else if ("Alugar".equalsIgnoreCase(opcoes)) {
            return new BibliotecaAlugar();
        } else if ("Devolver".equalsIgnoreCase(opcoes)){
            return new BibliotecaDevolver();
        } else {
            throw new IllegalArgumentException("Tipo de notificação desconhecido: " + opcoes);
        }
    }
}
