public class IT26102049lab2Q1 {

	public static void main (String[]args) {
	double length,width;
	double perimeter = 100;
	
	double width_ratio = 0.75 ;
	
	length = perimeter /(2*(1+width_ratio));
	width = width_ratio * length ;
	
	System.out.println ("the width is" + width);
	System.out.println ("the length is" + length);
	}
}
	