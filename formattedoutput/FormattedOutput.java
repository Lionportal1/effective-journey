package formattedoutput;

public class FormattedOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 35;
		int y = 44;
		int z = 5;
		
		double miles = 3.2;
		double minutes = 15;
		
		double mph = miles/minutes * 60;
		
		String fname = "Charlie";
		String lname = "Anderson";
		
		System.out.println("******************************************************************");
		
		System.out.printf("%d/%d = %d\n", x,y, x/y);
		System.out.printf("%d/%d = %1.8f\n", x,y, (float)x/y);
		System.out.printf("%d/%d = %1.2f\n", x,y, (float)x/y);
		
		System.out.printf("\n%s %s is %d years old\n", fname, lname, y);
		System.out.printf("\nIf %s ran %1.1f miles in %2.0f minutes, his speed was %2.1f mph\n", lname,miles,minutes,mph);
		System.out.println("\n******************************************************************");
		
	}

}
