package pizzaria;

public class Exemplo {
    public static void main(String[] args) {
        FabricaPizza cascata = new FabricaCascata();
        FabricaPizza tresIrmaos = new FabricaTresIrmaos();

        PizzaDoce doce = cascata.criarPizzaDoce();
        PizzaDoce doce2 = tresIrmaos.criarPizzaDoce();

        PizzaSalgada salgada = cascata.criarPizzaSalgada();
        PizzaSalgada salgada2 = tresIrmaos.criarPizzaSalgada();

        System.out.println("Sabores Doces: ");
        doce.exibirSaborDoce();
        doce2.exibirSaborDoce();
        System.out.println();
        System.out.println("Sabores Salgados: ");
        salgada.exibirSaborSalgado();
        salgada2.exibirSaborSalgado();
    }
}
