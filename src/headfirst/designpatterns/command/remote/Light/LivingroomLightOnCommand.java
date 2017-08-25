package headfirst.designpatterns.command.remote.Light;

import headfirst.designpatterns.command.remote.Command;

public class LivingroomLightOnCommand implements Command {
	Light light;

	public LivingroomLightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}
