package headfirst.designpatterns.composite.menu;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/8/10
 */
public abstract class MenuComponent {

    void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    void remove(MenuComponent menuComponent){
        throw  new UnsupportedOperationException();
    }

    MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getDescription() {
        throw new UnsupportedOperationException();
    }
    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

}
