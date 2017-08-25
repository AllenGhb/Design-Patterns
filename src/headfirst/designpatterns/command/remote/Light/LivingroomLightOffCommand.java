package headfirst.designpatterns.command.remote.Light;

import headfirst.designpatterns.command.remote.Command;

public class LivingroomLightOffCommand implements Command {
	Light light;

	public LivingroomLightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}
}
