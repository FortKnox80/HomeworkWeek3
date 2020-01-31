package kitchen;

//Create an oven object
public class Oven {
	
	public int temp;
	public int timer;
	public boolean on;
	
	public Oven() {
		temp = 0;
		timer = 0;
		on = false;
	}
	
	//set the oven temperature
	public int setTemp(int temperature) {
		
		if(temperature > 300 && temperature < 500) {
			temp = temperature;
			System.out.println("The oven is preheaing to " + temp + " degres.");
		}
		
		else {
			System.out.println("That temperature won't cook anything properly.");
		}
		
		return temp; 
	}
	
	//set the cook time
	public int setTimer(int time) {
		if(time > 180) {
			System.out.println("It's going to burn if it goes that long!");
		}
		else {
			timer = time;
			System.out.println("The timer is set for " + timer + " minutes.");
		}
		return timer;
	}
	
	public boolean ovenOn() {
		on = true;
		System.out.println("That oven is on.");
		return on;
	}
	
	public boolean ovenOff() {
		on = true;
		System.out.println("That oven is off.");
		return on;
	}

	public int getTimer() {
		return timer; 
	}

	public int getTemp() {
		return temp;
	}
}
