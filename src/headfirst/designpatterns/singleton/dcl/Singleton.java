package headfirst.designpatterns.singleton.dcl;

/**
 * @Discription:
 * Note: Danger!  This implementation of Singleton not guaranteed to work prior to Java 5
 * @Author: allen
 * @Date: 2017/7/11
 */
public class Singleton {

    private volatile static Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            synchronized(Singleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

}
