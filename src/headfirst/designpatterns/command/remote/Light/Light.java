package headfirst.designpatterns.command.remote.Light;

/**
 * 电灯
 * Created by zhouhezhen on 2017/7/11.
 */
public class Light {

    String location = "";

    public Light(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location + "light is on");
    }

    public void off(){
        System.out.println(location + "light is off");
    }
}
