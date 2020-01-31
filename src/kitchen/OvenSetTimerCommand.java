package kitchen;

//Turn on the oven timer
public class OvenSetTimerCommand implements Command{

	Oven oven;
	int time;
	int prevTime;
	
	public OvenSetTimerCommand(Oven oven, int time) {
		this.oven = oven;
		this.time = time;
	}
	
	
	public void execute() {
		 prevTime = oven.getTimer();
		 oven.setTimer(time);
	}

	//If the undo button is pressed reset the timer to the time it was set to before
	public void undo() {
		oven.setTemp(prevTime);
	}
}
