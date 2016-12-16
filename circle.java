package Core_java_s5;


public class circle extends Figure{		// child class circle extends parent class figure  

	static double pie=3.141;	// defining pie value static	
	double  redius=10.23;
	void findArea()				// Override methode1 from abstract class
	{
		area=pie*(redius*redius);		// calculating formula for area
		System.out.println("Area of circle = "+area +" sq.mm");	// printing value to console 
	}
	void findPerimeter()		// Override methode1 from abstract class
	{
		perimetry=2*pie*redius;		// calculating circumference 
		System.out.println("Perimetry of circle = "+perimetry +" mm");// printing value to console 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		circle b1 =new circle();  // creating new object for circle class
		System.out.println("=========================Circle======================");
		System.out.println("Redius:= "+b1.redius );	// printing value to console 
		b1.findArea();				
		b1.findPerimeter();
		System.out.println("=====================================================");

	}

}
