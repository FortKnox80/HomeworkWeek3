package kitchen;

//Create a radio object that can turn off and on
public class Radio {
	
	public boolean on;
	
	public Radio() {
		on = false;
	}

	public boolean radioOn() {
		on = true;
		System.out.println("The groovy tunes are going.");
		return on;
	}
	
	public boolean radioOff() {
		on = false;
		System.out.println("Peace and quite descends on the kitchen as the radio turns off.");
		return on;
	}
}
