
public class LeapYr {
	public static void main(String arg[]) {
		int year = 2400;
		
		
		if(year%100==0) {
			if(year%400==0) {
				System.out.print(year + " Leap Year");
			}else {
				System.out.print("Not a Leap Year");
			}
		}else {
			if(year%4==0) {
				System.out.print("Leap Year");
			}else {
				System.out.print("Not a Leap Year");
			}
			}
		}
}
		
		
		
	/*
	if ((year % 400 == 0) 
            || ((year % 4 == 0) && (year % 100 != 0))) { 
  
            // Both conditions true- Print leap year 
            System.out.println(year + " : Leap Year"); 
        } 
  
        else { 
            // Any condition fails- Print Non-leap year 
            System.out.println(year + " : Non - Leap Year"); 
        } 

}*/

