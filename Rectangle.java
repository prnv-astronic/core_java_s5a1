package Core_java_s5;

public class Rectangle extends Figure{		// child class circle extends parent class figure  

	
	double length=25.6,width=10.1;
	void findArea()				// Override methode1 from abstract class
	{
		area=(length*width);		// calculating formula for area
		System.out.println("Area of Rectangle = "+area +" sq.mm");	// printing value to console 
	}
	void findPerimeter()		// Override methode1 from abstract class
	{
		perimetry=2*(length+width);		// calculating circumference 
		System.out.println("Perimetry of Rectangle = "+perimetry +" mm");// printing value to console 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle b1 =new Rectangle();  // creating new object for circle class
		System.out.println("======================Rectangle======================");
		System.out.println("Length:= "+b1.length );	// printing value to console 
		System.out.println("Width:= "+b1.width );	// printing value to console
		b1.findArea();				
		b1.findPerimeter();
		System.out.println("=====================================================");

	}

}