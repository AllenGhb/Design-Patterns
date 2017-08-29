package headfirst.designpatterns.templatemethod.barista;

/**
 * @Discription: 咖啡因饮料
 * @Author: allen
 * @Date: 2017/8/28
 */
public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        //设置钩子
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    abstract void  brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments(){
        return true;
    }
}
