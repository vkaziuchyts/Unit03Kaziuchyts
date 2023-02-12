package lt.lhu.unit03.main;

public class Task08 {

	public static void main(String[] args) {
		
		  double a = 0; 
	      double b = 10;
	      double h = 1; 
	      double y;
	      	      
	      System.out.println(" -----------------------");
	      System.out.println("|     x     |     y     |");

	      for (double x = a; x <= b; x += h) {
	            y = 2 * (Math.tan(x / 2)) + 1;
	            
	      System.out.println(" -----------------------");
	      System.out.printf("|%-11f|%-11f|\n", x , y);
	      }

	      System.out.println(" -----------------------");
	      
	}
	     
}

