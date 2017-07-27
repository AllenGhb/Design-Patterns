package headfirst.designpatterns.collections.iterator;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/27
 */
public class DinerMenuIterator implements  Iterator {

    String[] items;
    int position = 0;

    public DinerMenuIterator(String[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null){
            return false;
        } else{
            return true;
        }
    }

    @Override
    public Object next() {
        String menuItem = items[position];
        position = position +1;
        return menuItem;
    }
}
