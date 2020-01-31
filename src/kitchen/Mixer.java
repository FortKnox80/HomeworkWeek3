package kitchen;

//Create a mixer object
public class Mixer {
	//Set up the three speeds that it can go on
	public static final int High = 3;
	public static final int Medium = 2;
	public static final int Low = 2; 
	public static final int Off = 0;
	public int temp;
	public int timer;
	public boolean on;
	public int speed; 
	
	public Mixer() {
		timer = 0;
		on = false;
		
	}
	//Set the mixing time
	public int setTimer(int time) {
		if(time > 40) {
			System.out.println("Your dough is going to over mixed if you leave it that long.");
		}
		else {
			timer = time;
			System.out.println("The timer for the mixer is set for " + timer + " minutes.");
		}
		return timer;
	}
	
	public boolean mixerOn() {
		on = true;
		System.out.println("The mixer is on.");
		return on;
	}
	
	public boolean mixerOff() {
		on = true;
		System.out.println("The mixer is off.");
		return on;
	}
	//Set the mixer speed to high
	public void high() {
		speed = High;
		System.out.println("The mixer speed is set to high.");
	}
	
	//Set the mixer speed to medium
	public void medium() {
		speed = Medium;
		System.out.println("The mixer speed is set to medium.");
	}
	
	//Set the mixer speed to low
	public void low() {
		speed = Low;
		System.out.println("The mixer speed is set to low.");
	}
	public int getSpeed() {
		return speed;
	}
	
	public int getTimer() {
		return timer; 
	}

}
