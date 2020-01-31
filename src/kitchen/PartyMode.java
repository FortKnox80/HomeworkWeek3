package kitchen;

//Create a command class that can turn on all the items in the kitchen
public class PartyMode implements Command {

	Command[] commands;
	
	public PartyMode(Command[] commands) {
		this.commands = commands;
	}

	public void execute() {
		for(int i =0; i<commands.length; i++) {
			commands[i].execute();
		}
		
	}

	
	public void undo() {
		
		
	}
	

}
