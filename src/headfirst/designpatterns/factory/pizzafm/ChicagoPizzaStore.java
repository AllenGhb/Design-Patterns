package headfirst.designpatterns.factory.pizzafm;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/25
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {
        if(item.equals("cheesse")){
            return new ChicagoStyleCheesePizza();
        }else if(item.equals("veggie")){
            return new ChicagoStyleVeggiePizza();
        }else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
