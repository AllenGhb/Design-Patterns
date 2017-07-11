package headfirst.designpatterns.singleton.classic;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/11
 */
public class SingletonMain {

    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }

}
