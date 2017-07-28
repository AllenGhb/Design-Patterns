package headfirst.designpatterns.combining.factory.adapter;

import headfirst.designpatterns.combining.factory.Quackable;
import headfirst.designpatterns.combining.factory.goose.Goose;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/28
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

    public String toString() {
        return "Goose pretending to be a duck";
    }
}
