package headfirst.designpatterns.templatemethod.simplebarista;

/**
 * Created by zhouhezhen on 2017/7/20.
 */
public class Barista {

    public static void main(String[] args){
        Tea tea  = new Tea();
        Coffee coffee  = new Coffee();
        System.out.println("Making tea ...");
        tea.prepareRecipe();
        System.out.println("Making coffee ...");
        coffee.prepareRecipe();
    }

}
