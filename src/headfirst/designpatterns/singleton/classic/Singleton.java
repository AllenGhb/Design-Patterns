package headfirst.designpatterns.singleton.classic;

/**
 * @Discription:
 * NOTE: This is not thread safe!
 * @Author: allen
 * @Date: 2017/7/11
 */
public class Singleton {

    private static Singleton uniqueInstance;

    private  Singleton(){}

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public String getDescription(){
        return "I'm a classic Singleton!";
    }
}
