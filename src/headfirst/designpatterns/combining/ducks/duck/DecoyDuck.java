package headfirst.designpatterns.combining.ducks.duck;

import headfirst.designpatterns.combining.ducks.Quackable;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/27
 */
public class DecoyDuck implements Quackable {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
