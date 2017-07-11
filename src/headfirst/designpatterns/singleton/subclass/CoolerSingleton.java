package headfirst.designpatterns.singleton.subclass;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/11
 */
public class CoolerSingleton extends Singleton {

    // useful instance variables here

    protected  static Singleton uniqueInstance;

    private  CoolerSingleton(){
        super();
    }

    // useful methods here
}
