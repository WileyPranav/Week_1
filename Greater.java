
public class Greater {

	public static void main(String[] args) {
		//int  y;   // Declare 2 numbers
		int x = 10;
		int y = 15;
		int z = 20; // Declared & Initialised 
		if(x>y && x>z) {
			System.out.print("First No is greatest");
		}else { if(y>x && y>z) {
					System.out.print("Second No is Greatest");
					}else {
					System.out.print("Third No is the greatest");
					}
			}
	}
}
