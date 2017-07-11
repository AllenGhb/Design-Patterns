package headfirst.designpatterns.singleton.subclass;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/11
 */
public class SingletonTestDrive {

    public static void main(String[] args) {
        Singleton foo = CoolerSingleton.getInstance();
        Singleton bar = HotterSingleton.getInstance();
        System.out.println(foo);
        System.out.println(bar);
    }

}
