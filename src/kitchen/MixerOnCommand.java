package kitchen;

//Turn on the mixer object
public class MixerOnCommand implements Command{

	Mixer mixer;
	
	public MixerOnCommand(Mixer mixer) {
		this.mixer = mixer;
	}
	
	public void execute() {
		mixer.mixerOn();
	}

	public void undo() {
		mixer.mixerOff();
		
	}
}
