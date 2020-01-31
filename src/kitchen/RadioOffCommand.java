package kitchen;

//Turn off the radio object
public class RadioOffCommand implements Command{

	Radio radio;
	
	public RadioOffCommand(Radio radio) {
		this.radio = radio;
	}
	
	public void execute() {
		radio.radioOff();
	}
	
	public void undo() {
		radio.radioOn();
	}
	

}
