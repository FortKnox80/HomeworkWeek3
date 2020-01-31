package kitchen;

//Create a  kitchen command center object
public class KitchenCommandCenter {

	int buttonNumber;
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;

	public KitchenCommandCenter() {
		buttonNumber = 15;
		onCommands = new Command[buttonNumber]; 
		offCommands = new Command[buttonNumber];
	

		Command noCommand = new NoCommand();
	
		for(int i = 0; i < buttonNumber; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
		
	}
	
	public void onButtonPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonPushed() {
		undoCommand.undo();
	}
	
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\n------Command Center------\n");
		for(int i =0; i < onCommands.length; i++) {
			buffer.append("[button " + i + onCommands[i].getClass().getName()+"\n");
		}
		return buffer.toString();
		
	}
}
