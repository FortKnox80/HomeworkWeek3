package kitchen;

//Create a kitchen light object
public class KitchenLight {
	
	public boolean on;
	
	public KitchenLight() {
		on = false;
	}

	public boolean lightOn() {
		on = true;
		System.out.println("All of the dazzling kitchen lights are on.");
		return on;
	}
	
	public boolean lightOff() {
		on = false;
		System.out.println("The kitchen is no shrowded in darkness as all the lights turn off.");
		return on;
	}
}
