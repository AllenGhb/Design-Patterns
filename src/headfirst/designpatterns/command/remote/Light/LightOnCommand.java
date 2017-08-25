package headfirst.designpatterns.command.remote.Light;

import headfirst.designpatterns.command.remote.Command;

/**
 * Created by zhouhezhen on 2017/7/11.
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }


    @Override
    public void execute() {
        light.on();
    }
}
