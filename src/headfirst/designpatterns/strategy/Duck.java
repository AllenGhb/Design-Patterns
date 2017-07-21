package headfirst.designpatterns.strategy;

/**
 * 鸭子类
 * Created by Administrator on 2017/7/20 0020.
 * 利用继承来提供行为的缺点：
 * 1：代码在多个子类中重复
 * 2：运行时的行为不容易改变
 * 3：很难知道类的全部行为
 * 4：改变会影响全身，造成其他子类不想要的改变
 *
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /** 鸭子的行为 */

    abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float,even decoys!");
    }




}
