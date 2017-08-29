package headfirst.designpatterns.iterenum;

import headfirst.designpatterns.adapter.iterenum.*;
import headfirst.designpatterns.adapter.iterenum.IteratorEnumeration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/8/29
 */
public class IteratorEnumerationTestDrive {

    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>(Arrays.asList(args));
        Enumeration<?> enumeration = new IteratorEnumeration(l.iterator());
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }

}
