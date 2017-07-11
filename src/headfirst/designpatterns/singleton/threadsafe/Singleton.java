package headfirst.designpatterns.singleton.threadsafe;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/11
 */
public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton(){
    }

    // other useful instance variables here

    public synchronized static Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public String getDescription(){
        return "I'm a thread safe Singleton!";
    }


}
