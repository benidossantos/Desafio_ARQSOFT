package padroesunificados;

public class FactoryMethod {

    private static final FactoryMethod instance = new FactoryMethod();

    private FactoryMethod() {}

    public static FactoryMethod getInstance() {
        return instance;
    }

    public FabricaAbstrata obterFabrica(String tipo) {
        Class<?> classe;
        Object objeto;
        try {
            classe = Class.forName("padroesunificados.Fabrica" + tipo);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Fábrica inexistente");
        }
        if (!(objeto instanceof FabricaAbstrata)) {
            throw new IllegalArgumentException("Fábrica inválida");
        }
        return (FabricaAbstrata) objeto;
    }
}
