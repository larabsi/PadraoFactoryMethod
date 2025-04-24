public class BibliotecaFactory {
    public static IBiblioteca obterOpcoes(String opcoes) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("padroescriacao.factorymethod.Opcoes" + opcoes);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Opcao inexistente");
        }
        if (!(objeto instanceof IBiblioteca)) {
            throw new IllegalArgumentException("Opcao inválida");
        }
        return (IBiblioteca) objeto;
    }
}
