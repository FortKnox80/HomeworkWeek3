package kitchen;

//Create a command to turn on the blast chiller
public class BlastChillerOnCommand implements Command{

	BlastChiller chiller;
	
	public BlastChillerOnCommand(BlastChiller chiller) {
		this.chiller = chiller;
	}
	
	public void execute() {
		chiller.chillerOn();
	}

	
	public void undo() {
		chiller.chillerOff();
		
	}
	

}
