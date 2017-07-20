package headfirst.designpatterns.command.simpleremote;

/**
 * 这是一个遥控器
 * Created by zhouhezhen on 2017/7/11.
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {
    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
