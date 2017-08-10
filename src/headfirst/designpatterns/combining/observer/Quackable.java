package headfirst.designpatterns.combining.observer;

import headfirst.designpatterns.combining.observer.observer.QuackObservable;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/31
 */
public interface Quackable extends QuackObservable{

    void quack();

}
