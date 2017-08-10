package headfirst.designpatterns.combining.observer.adapter;

import headfirst.designpatterns.combining.observer.Quackable;
import headfirst.designpatterns.combining.observer.goose.Goose;
import headfirst.designpatterns.combining.observer.observer.Observable;
import headfirst.designpatterns.combining.observer.observer.Observer;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/31
 */
public class GooseAdapter implements Quackable {

    Goose goose;
    Observable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    public String toString() {
        return "Goose pretending to be a duck";
    }
}
