package headfirst.designpatterns.templatemethod.barista;

/**
 * Created by zhouhezhen on 2017/7/20.
 */
public class Tea extends  CaffeineBeverage {

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }
}
