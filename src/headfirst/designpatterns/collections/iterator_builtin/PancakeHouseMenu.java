package headfirst.designpatterns.collections.iterator_builtin;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/27
 */
public class PancakeHouseMenu implements Menu{

    ArrayList<String> menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast");
        addItem("Regular Pancake Breakfast");
        addItem("Blueberry Pancakes");
        addItem("Waffles");
    }

    public void addItem(String name){
        menuItems.add(name);
    }

    public ArrayList<String> getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator<String> createIterator() {
        return menuItems.iterator();
    }

    public String toString(){
        return "Pancake House Menu";
    }

    // other menu methods here
}
