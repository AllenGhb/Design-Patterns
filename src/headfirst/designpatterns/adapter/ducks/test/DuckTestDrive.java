package headfirst.designpatterns.adapter.ducks.test;

import headfirst.designpatterns.adapter.ducks.Duck;
import headfirst.designpatterns.adapter.ducks.MallardDuck;
import headfirst.designpatterns.adapter.ducks.TurkeyAdapter;
import headfirst.designpatterns.adapter.ducks.WildTurkey;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/24
 */
public class DuckTestDrive {

    public static void main(String[] args) {
        /** 野鸭子对象 **/
        MallardDuck duck = new MallardDuck();
        /** 野火鸡对象 **/
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("the Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);

    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }

}
