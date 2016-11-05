package AutomationFramework;

public class MetersToFeetConvertor {
	public static void main(String[] args) {
		Double MeterLength = Double.parseDouble(args[0]);
		MetersToFeetConvertor MeterstoFeet = new MetersToFeetConvertor();
		Double Result = MeterstoFeet.ConverToFeet(MeterLength);
		System.out.println("Result for "+ args[0] +"  Meters To Feet is"+" "+ Result);
		
		
	
		
		
	}
    public double ConverToFeet (double Meter){
    	return Meter*3.14;
    	
    }
    
}
