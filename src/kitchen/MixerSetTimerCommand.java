package kitchen;

//A command to set the mixer object timer
public class MixerSetTimerCommand implements Command{

	Mixer mixer;
	int prevTime;
	
	public MixerSetTimerCommand(Mixer mixer) {
		this.mixer = mixer;
	}
	
	public int getTime(int time) {
		mixer.setTimer(time);
		return time;
	}
	
	public void execute() {
		 prevTime = mixer.getTimer();
		 mixer.getTimer();
	}

	public void undo() {
		mixer.setTimer(prevTime);
	}
}
