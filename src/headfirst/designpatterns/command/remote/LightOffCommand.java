package headfirst.designpatterns.command.remote;

/**
 * Created by zhouhezhen on 2017/7/11.
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
