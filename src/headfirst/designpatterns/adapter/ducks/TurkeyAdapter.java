package headfirst.designpatterns.adapter.ducks;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/24
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i = 0 ;i<5;i++){
            turkey.fly();
        }
    }
}
