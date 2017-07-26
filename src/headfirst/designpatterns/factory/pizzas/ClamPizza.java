package headfirst.designpatterns.factory.pizzas;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/25
 */
public class ClamPizza extends Pizza {

    public ClamPizza(){
        name = "Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }

}
