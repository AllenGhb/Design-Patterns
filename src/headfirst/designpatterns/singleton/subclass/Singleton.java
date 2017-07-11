package headfirst.designpatterns.singleton.subclass;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/11
 */
public class Singleton {

    private static Singleton uniqueInstance;

    protected Singleton(){}

    // other useful instance variables here

    public static synchronized  Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return  uniqueInstance;
    }

    // other useful methods here

}
