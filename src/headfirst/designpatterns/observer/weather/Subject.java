package headfirst.designpatterns.observer.weather;

/**
 * Created by allen on 2017/7/21 0021.
 */
public interface Subject{
    // 注册
    void registerObserver(Observer o);
    // 移除
    void removeObserver(Observer o);
    // 异步通知
    void notifyObservers();

}
