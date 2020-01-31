package kitchen;

//Set the mixer speed to medium
public class MixerMediumSpeedCommand implements Command{

	Mixer mixer;
	int prevSpeed;
	
	public MixerMediumSpeedCommand(Mixer mixer) {
		this.mixer = mixer;
	}
	
	
	public void execute() {
		 prevSpeed = mixer.getSpeed();
		 mixer.medium();
	}

	//If undo, set the mixer speed to what it was previously
	public void undo() {
		if(prevSpeed == Mixer.High) {
			mixer.high();
		}
		else if(prevSpeed == Mixer.Medium) {
			mixer.medium();
		}
		else if(prevSpeed == Mixer.Low) {
			mixer.low();
		}
	}
}
