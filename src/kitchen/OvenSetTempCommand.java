package kitchen;

//Create a command to set the oven temperature.


public class OvenSetTempCommand implements Command{

	Oven oven;
	int temp;
	int prevTemp;
	
	public OvenSetTempCommand(Oven oven, int temp) {
		this.oven = oven;
		this.temp = temp;
	}
	
	
	public void execute() {
		 prevTemp = oven.getTemp();
		 oven.setTemp(temp);
	}
	
	//if there is an undo, set the temp to what it was before
	public void undo() {
		oven.setTemp(prevTemp);
	}

}
