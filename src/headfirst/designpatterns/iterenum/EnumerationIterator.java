package headfirst.designpatterns.iterenum;


import java.util.Enumeration;
import java.util.Iterator;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/8/29
 */
public class EnumerationIterator implements Iterator<Object> {

    Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    public void remove(){
        throw  new UnsupportedOperationException();
    }
}
