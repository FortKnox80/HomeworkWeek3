package kitchen;

//A command to turn off the light object
public class LightOffCommand implements Command{

	KitchenLight light;
	
	public LightOffCommand(KitchenLight light) {
		this.light = light;
	}
	
	public void execute() {
		light.lightOff();
	}

	public void undo() {
		light.lightOn();
		
	}
	
}
