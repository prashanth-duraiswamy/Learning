
public class Assignment {

	public static void main(String[] args) {
		System.out.println("Inch value is 5 and corresponding cm value is "+inchToCm(5));
	}
	private static double inchToCm(double inchVal){
		return inchVal * 2.54;
	}
}
