
public class Sleepin {
	
	public boolean sleepIn(boolean weekday, boolean vacation) {
		if (!weekday || vacation) {
		
		System.out.println("If we are on vacation, then sleep in is true");
		return true;
		
	}   else {
		
		System.out.println("If we are on weekday, then sleep in is false");
		
	}
		return false;
		
	}
}



