package kitchen;

//Interface for all of the commands
public interface Command {

	public void execute();
	public void undo();

}
