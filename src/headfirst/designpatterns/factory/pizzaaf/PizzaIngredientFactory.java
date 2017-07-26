package headfirst.designpatterns.factory.pizzaaf;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/25
 */
public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();

}
