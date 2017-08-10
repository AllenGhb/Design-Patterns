package headfirst.designpatterns.combining.observer.observer;

import headfirst.designpatterns.combining.observer.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/31
 */
public class Flock implements Quackable {

    ArrayList<Quackable> ducks = new ArrayList<>();

    public void add(Quackable duck){
        ducks.add(duck);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = ducks.iterator();
        while (iterator.hasNext()){
            Quackable duck = (Quackable) iterator.next();
            duck.quack();
        }

    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator<Quackable> iterator = ducks.iterator();
        while(iterator.hasNext()){
            Quackable duck = (Quackable) iterator.next();
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }

    public String toString() {
        return "Flock of Ducks";
    }
}
