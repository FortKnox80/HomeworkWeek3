package kitchen;

//Create a blast chiller object
public class BlastChiller {
	
	public boolean on;
	
	public BlastChiller() {
		on = false;
	}

	public boolean chillerOn() {
		on = true;
		System.out.println("The blast chiller is on.");
		return on;
	}
	
	public boolean chillerOff() {
		on = false;
		System.out.println("The blast chiller is off.");
		return on;
	}

}
