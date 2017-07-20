package headfirst.designpatterns.templatemethod.barista;

/**
 * Created by zhouhezhen on 2017/7/20.
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();

    }

    abstract void addCondiments();

    abstract void brew();

    private void pourInCup() {
        System.out.println("Boiling water");
    }

    private void boilWater() {
        System.out.println("Pouring into cup");
    }

}
