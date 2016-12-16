package Core_java_s5;


public class Triangle extends Figure{		// child class circle extends parent class figure  

	
	double height=5.1,base=8.3,side1=10.3,side2=15.25;

/*============== Overriding abstract class methods=======================*/
	void findArea()				// Override methode1 from abstract class
	{
		area=(height*base)/2;		// calculating formula for area
		System.out.println("Area of Triangle = "+area +" sq.mm");	// printing value to console 
	}
	void findPerimeter()		// Override methode1 from abstract class
	{
		perimetry=side1+side2+base;		// calculating circumference 
		System.out.println("Perimetry of Triangle = "+perimetry +" mm");// printing value to console 
	}
	
/*============================ main body===================================*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle b1 =new Triangle();  // creating new object for circle class
		
		System.out.println("=========================Triangle======================");
		System.out.println("SIDE 1 : "+b1.side1);
		System.out.println("SIDE 2 : "+b1.side2);
		System.out.println("BASE   : "+b1.base);
		
		b1.findArea();				
		b1.findPerimeter();
		System.out.println("=======================================================");
		

	}

}
/*====================== end of class triangle ==============================*/