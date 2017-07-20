package headfirst.designpatterns.templatemethod.barista;

/**
 * Created by zhouhezhen on 2017/7/20.
 */
public class Coffee extends CaffeineBeverage {

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }
}
