package mn223dn_assign3;

public class AlarmClockMain {
	
	public static void main(String[] args){
		
		AlarmClock now = new AlarmClock(23, 48);
		
		now.displayTime();
		
		now.setAlarm(6, 15);
		
		
		for(int i=0; i<500 ; i++){
			now.timeTick();
		}

		now.displayTime();

	}
}
