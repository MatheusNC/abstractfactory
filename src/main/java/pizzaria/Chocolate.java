package pizzaria;

public class Chocolate implements PizzaDoce{
    @Override
    public void exibirSaborDoce() {
        System.out.printf("<Chocolate> Ingredientes: Chocolate ao leite e granulado");
    }
}
