package kitchen;

//Instantiate the kitchen command center 
public class CommandCenterLoadUp {
	
	public static void main(String[] args) {
		//Instantiate the command center
		KitchenCommandCenter commandCenter = new KitchenCommandCenter();
		//Instantiate each of the objects in the kitchen to control
		BlastChiller chiller = new BlastChiller();
		KitchenLight light = new KitchenLight();
		Radio radio = new Radio();
		Mixer mixer = new Mixer();
		Oven oven = new Oven();
		
		//Instantiate each command for the object
		BlastChillerOnCommand chillerOn = new BlastChillerOnCommand(chiller);
		BlastChillerOffCommand chillerOff = new BlastChillerOffCommand(chiller);
		
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		
		RadioOnCommand radioOn = new RadioOnCommand(radio);
		RadioOffCommand radioOff = new RadioOffCommand(radio);
		
		MixerOnCommand mixerOn = new MixerOnCommand(mixer);
		MixerOffCommand mixerOff = new MixerOffCommand(mixer);
		MixerHighSpeedCommand mixerHigh = new MixerHighSpeedCommand(mixer);
		MixerLowSpeedCommand mixerLow = new MixerLowSpeedCommand(mixer);
		MixerMediumSpeedCommand mixerMedium = new MixerMediumSpeedCommand(mixer);
		
		OvenOnCommand ovenOn = new OvenOnCommand(oven);
		OvenOffCommand ovenOff = new OvenOffCommand(oven);
		OvenSetTempCommand ovenTempCake = new OvenSetTempCommand(oven, 350);
		OvenSetTimerCommand ovenTimer = new OvenSetTimerCommand(oven, 50);
		
		//Create a party in the kitchen by turning everything on at once
		Command[] partyOn = { lightOn, radioOn, mixerOn, ovenOn, chillerOn}; 
		Command[] partyOff = {lightOff, radioOff, mixerOff, ovenOff, chillerOff};
		PartyMode partyOnMode = new PartyMode(partyOn);
		PartyMode partyOffMode = new PartyMode(partyOff);
		
		//Load the buttons up with all of the controls
		commandCenter.setCommand(0, lightOn, lightOff);
		commandCenter.setCommand(1, radioOn, radioOff);
		commandCenter.setCommand(3, chillerOn, chillerOff);
		commandCenter.setCommand(4, mixerOn, mixerOff);
		commandCenter.setCommand(5, mixerLow, mixerOff);
		commandCenter.setCommand(6, mixerMedium, mixerOff);
		commandCenter.setCommand(7, mixerHigh, mixerOff);
		commandCenter.setCommand(8, ovenOn, ovenOff);
		commandCenter.setCommand(9, ovenTempCake, ovenOff);
		commandCenter.setCommand(10, ovenTimer, ovenOff);
		commandCenter.setCommand(11, partyOnMode, partyOffMode);
		
	    //Turn on party mode
		commandCenter.onButtonPushed(10);
		
		//Turn off all the lights
		commandCenter.offButtonPushed(0);
		//Undo the button press to get the lights back on
		commandCenter.undoButtonPushed();
		
		//Turn the blast chiller off
		commandCenter.offButtonPushed(3);
		//Set the mixer to medium
		commandCenter.onButtonPushed(6);
		//Preheat the oven
		commandCenter.onButtonPushed(9);
		//Set the oven timer
		commandCenter.onButtonPushed(10);
		
		//Turn off everything in the kitchen
		commandCenter.offButtonPushed(11);
		
	
	}

}
