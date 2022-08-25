package pizzaria;

public class FabricaTresIrmaos implements FabricaPizza{
    @Override
    public PizzaDoce criarPizzaDoce() {
        return new Chocolate();
    }

    @Override
    public PizzaSalgada criarPizzaSalgada() {
        return new Calabresa();
    }
}
