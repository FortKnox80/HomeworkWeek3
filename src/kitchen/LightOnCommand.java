package kitchen;

//A command to turn on the light object
public class LightOnCommand implements Command{

	KitchenLight light;
	
	public LightOnCommand(KitchenLight light) {
		this.light = light;
	}
	
	public void execute() {
		light.lightOn();
	}


	public void undo() {
		light.lightOff();
		
	}
	

}
