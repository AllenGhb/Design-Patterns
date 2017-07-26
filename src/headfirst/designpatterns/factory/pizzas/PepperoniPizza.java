package headfirst.designpatterns.factory.pizzas;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/25
 */
public class PepperoniPizza extends Pizza {

    public PepperoniPizza(){
        name = "Pepperoni Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Sliced Pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Grated parmesan cheese");
    }

}
