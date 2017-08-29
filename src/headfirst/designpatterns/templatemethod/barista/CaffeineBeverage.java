package headfirst.designpatterns.templatemethod.barista;

/**
 * Created by zhouhezhen on 2017/7/20.
 */
public abstract class CaffeineBeverage {

    // 准备的食谱
    final void prepareRecipe(){
        // 烧水
        boilWater();
        // 冲泡
        brew();
        // 倒入杯
        pourInCup();
        // 添加调料
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
