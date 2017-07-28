package headfirst.designpatterns.combining.adapter.adapter;

import headfirst.designpatterns.combining.adapter.Quackable;
import headfirst.designpatterns.combining.adapter.goose.Goose;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/27
 */
public class GooseAdapter implements Quackable {

    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
