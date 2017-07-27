package headfirst.designpatterns.state.gumballstate;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/26
 */
public interface State {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    void refill();

}
