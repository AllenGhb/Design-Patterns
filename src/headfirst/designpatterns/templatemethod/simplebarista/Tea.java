package headfirst.designpatterns.templatemethod.simplebarista;

/**
 * Created by zhouhezhen on 2017/7/20.
 */
public class Tea {

    void prepareRecipe(){
        // 烧水
        boilWater();
        // 泡茶
        steepTeaBag();
        // 倒茶
        pourInCup();
        // 添加柠檬
        addLemon();
    }

    private void addLemon() {
        System.out.println("Adding Lemon");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }


    private void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }
}
