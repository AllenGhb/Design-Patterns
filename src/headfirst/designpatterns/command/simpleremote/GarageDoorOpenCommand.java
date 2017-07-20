package headfirst.designpatterns.command.simpleremote;

/**
 * Created by zhouhezhen on 2017/7/11.
 */
public class GarageDoorOpenCommand implements Command{

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }


    @Override
    public void execute() {
        garageDoor.up();
    }
}
