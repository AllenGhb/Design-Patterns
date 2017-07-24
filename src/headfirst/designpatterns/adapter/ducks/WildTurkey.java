package headfirst.designpatterns.adapter.ducks;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/24
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
