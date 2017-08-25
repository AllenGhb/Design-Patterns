package headfirst.designpatterns.composite.menu;

/**
 * @Discription: 女服务员
 * @Author: allen
 * @Date: 2017/8/10
 */
public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }
}
