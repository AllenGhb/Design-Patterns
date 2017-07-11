package headfirst.designpatterns.singleton.chocolate;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/11
 */
public class ChocolatateMain {

    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.isBoiled();
        boiler.drain();

        ChocolateBoiler boilder2 = ChocolateBoiler.getInstance();
    }

}
