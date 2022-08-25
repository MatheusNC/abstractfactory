package pizzaria;

public class FabricaCascata implements FabricaPizza{

    @Override
    public PizzaDoce criarPizzaDoce() {
        return new BananaNevada();
    }

    @Override
    public PizzaSalgada criarPizzaSalgada() {
        return new QuatroQueijos();
    }
}
