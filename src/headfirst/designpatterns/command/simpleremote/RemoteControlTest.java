package headfirst.designpatterns.command.simpleremote;

/**
 * Created by zhouhezhen on 2017/7/11.
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setSlot(lightOn);
        remote.buttonWasPressed();
        remote.setSlot(garageOpen);
        remote.buttonWasPressed();
    }


}
