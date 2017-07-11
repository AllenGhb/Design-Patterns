package headfirst.designpatterns.singleton.stat;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/11
 */
public class Singleton {

    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    public String getDescription(){
        return "I'm a statically initialized Singleton!";
    }

}
