package headfirst.designpatterns.factory.pizzas;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/25
 */
public class CheesePizza extends Pizza{

    public CheesePizza(){
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }

}
