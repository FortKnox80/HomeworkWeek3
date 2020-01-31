package kitchen;

//A command to turn off the mixer object
public class MixerOffCommand implements Command{

	Mixer mixer;
	
	public MixerOffCommand(Mixer mixer) {
		this.mixer = mixer;
	}
	
	public void execute() {
		mixer.mixerOff();
	}

	public void undo() {
		mixer.mixerOn();
		
	}
}
