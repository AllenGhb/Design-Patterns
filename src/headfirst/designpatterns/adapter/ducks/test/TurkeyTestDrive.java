package headfirst.designpatterns.adapter.ducks.test;

import headfirst.designpatterns.adapter.ducks.DuckAdapter;
import headfirst.designpatterns.adapter.ducks.MallardDuck;
import headfirst.designpatterns.adapter.ducks.Turkey;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/24
 */
public class TurkeyTestDrive {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        Turkey duckAdapter = new DuckAdapter(duck);

        for(int i= 0;i< 10;i++){
            System.out.println("The DuckAdapter says...");
            duckAdapter.gobble();
            duckAdapter.fly();
        }
    }

}
