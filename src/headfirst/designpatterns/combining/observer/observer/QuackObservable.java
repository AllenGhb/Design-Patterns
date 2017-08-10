package headfirst.designpatterns.combining.observer.observer;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/31
 */
public interface QuackObservable {

    void registerObserver(Observer observer);

    void notifyObservers();


}
