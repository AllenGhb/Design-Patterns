package headfirst.designpatterns.adapter.iterenum;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/24
 */
public class EnumerationIteratorTestDrive {

    public static void main(String[] args) {
        Vector<String> v = new Vector<>(Arrays.asList(args));
        Iterator<?> iterator = new EnumerationIterator(v.elements());
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
