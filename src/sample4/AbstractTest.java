package sample4;

import java.util.Calendar;

public abstract class AbstractTest {
	public abstract String dayInfo();
	
	public static AbstractTest getInstance() {
		Calendar calendar = Calendar.getInstance();
		int dayNum = calendar.get(Calendar.DAY_OF_WEEK);	//요일수 얻기
		
		switch (dayNum) {
		case 1: return new Sunday(); 
		case 2: return new Monday(); 
		case 3: return new Thursday(); 
		case 4: return new Wednesday(); 
		case 5: return new Thursday(); 
		case 6: return new Friday(); 
		case 7: return new Saturday(); 
		}
		return null;
	}
}
