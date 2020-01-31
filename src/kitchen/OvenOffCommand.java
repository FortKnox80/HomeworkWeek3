package kitchen;

//Turn off the oven object
public class OvenOffCommand implements Command{

	Oven oven;
	
	public OvenOffCommand(Oven oven) {
		this.oven = oven;
	}
	
	public void execute() {
		oven.ovenOff();
	}

	public void undo() {
		oven.ovenOn();
		
	}
}
