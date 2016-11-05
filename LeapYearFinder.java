package AutomationFramework;

import org.apache.bcel.generic.RETURN;

public class LeapYearFinder {
public static void main(String[] args) {
	int Year = Integer.parseInt(args[0]);
	LeapYearFinder LeapY= new LeapYearFinder();
	 boolean IsLeap = LeapY.isLeapYear(Year);
	 
	 if (IsLeap == true)
	 { System.out.println ("Leap Year !!!!!");
			
} else 
{
	System.out.println ("Not a Leap Year :(");
}
}



	 
public boolean isLeapYear(int Year){
	if (Year % 400 == 0){
		return true;
	}else if ((Year % 4) == 0 && (Year % 100 != 0)){
		return true;
		
	}else
		return false;
		}
}
