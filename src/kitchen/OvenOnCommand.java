package kitchen;

//Turn on the oven object
public class OvenOnCommand implements Command{

	Oven oven;
	
	public OvenOnCommand(Oven oven) {
		this.oven = oven;
	}
	
	public void execute() {
		oven.ovenOn(); 
	}

	public void undo() {
		oven.ovenOff();
	}
	

}
