package headfirst.designpatterns.factory.pizzas;

import java.util.ArrayList;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/24
 */
public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public String getName() {
        return name;
    }

    // 1:准备
    public void prepare(){
        System.out.println("Preparing " + name);
    }

    // 2:烤
    public void bake(){
        System.out.println("Baking " + name);
    }

    // 3:切
    public void cut(){
        System.out.println("Cutting " + name);
    }

    // 4:装
    public void box(){
        System.out.println("Boxing " + name);
    }

    public String toString(){
        // code to display pizza name and ingredients
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for(String topping : toppings){
            display.append(topping + "\n");
        }
        return display.toString();
    }

}
