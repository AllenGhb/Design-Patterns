package headfirst.designpatterns.collections.iterator;

import java.util.ArrayList;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/27
 */
public class PancakeHouseMenuIterator implements Iterator {

    ArrayList<String> items;

    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<String> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.size()){
            return false;
        }else{
            return true;
        }

    }

    @Override
    public Object next() {
        String menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }

}
