package kitchen;

//Turn on the radio object
public class RadioOnCommand implements Command{

	Radio radio;
	
	public RadioOnCommand(Radio radio) {
		this.radio = radio;
	}
	
	public void execute() {
		radio.radioOn();
	}

	public void undo() {
		radio.radioOff();		
	}
	

}
