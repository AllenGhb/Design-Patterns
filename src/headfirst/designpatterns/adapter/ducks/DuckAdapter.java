package headfirst.designpatterns.adapter.ducks;

import java.util.Random;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/24
 */
public class DuckAdapter implements Turkey {

    Duck duck;
    Random random;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        this.random = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if(random.nextInt(5) == 0){
            duck.fly();
        }
    }
}
