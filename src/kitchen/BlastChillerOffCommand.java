package kitchen;

//Create a command to turn off the blast chiller
public class BlastChillerOffCommand implements Command{

	BlastChiller chiller;
	
	public BlastChillerOffCommand(BlastChiller chiller) {
		this.chiller = chiller;
	}
	
	public void execute() {
		chiller.chillerOff();
	}


	public void undo() {
		chiller.chillerOn();
		
	}
	

}
