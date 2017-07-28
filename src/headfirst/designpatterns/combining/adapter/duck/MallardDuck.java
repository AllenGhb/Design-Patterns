package headfirst.designpatterns.combining.adapter.duck;

import headfirst.designpatterns.combining.adapter.Quackable;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/27
 */
public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
