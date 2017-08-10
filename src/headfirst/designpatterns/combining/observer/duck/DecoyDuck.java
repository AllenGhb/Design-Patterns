package headfirst.designpatterns.combining.observer.duck;

import headfirst.designpatterns.combining.observer.Quackable;
import headfirst.designpatterns.combining.observer.observer.Observable;
import headfirst.designpatterns.combining.observer.observer.Observer;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/31
 */
public class DecoyDuck implements Quackable {

    Observable observable;

    public DecoyDuck(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
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

    public String toString(){
        return "Decoy duck";
    }
}
