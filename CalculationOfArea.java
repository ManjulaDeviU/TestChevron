
//calculating area of rectangle and square


class AreaParameters
{	
	int lengthOfRectangle;
	int breadthOfRectangle;
	int sideOfSquare;
        
	public AreaParameters(int lengthOfRectangle,int breadthOfRectangle,int sideOfSquare)
	{
		this.sideOfSquare=sideOfSquare;
		this.lengthOfRectangle=lengthOfRectangle;
		this.breadthOfRectangle=breadthOfRectangle;
	}


}

class SquareArea extends AreaParameters				//inheritance
{
	
	SquareArea(int side)
	{
		super(4,5,6);
		sideOfSquare=side;
	}

	
	void calculationOfSquareArea()			//method2
	{
		int area;
		area=sideOfSquare*sideOfSquare;
		System.out.println("area of square= "+area);
	}
	    
}


class RectangleArea extends AreaParameters			//inheritance
{
	RectangleArea(int length,int breadth)
	{
		super(3,4,5);
		lengthOfRectangle=length;
		breadthOfRectangle=breadth;
	}
	
	void calculationOfRectangleArea()		//method3
	{	
		int area;
		area=lengthOfRectangle*breadthOfRectangle;
		System.out.println("area of rectangle= "+area);
	}
}

public class CalculationOfArea
{
	
	public static void main(String args[])
	    {
		AreaParameters a =new AreaParameters(2,3,2);
		SquareArea squarearea=new SquareArea(1);
		squarearea.calculationOfSquareArea();	
		RectangleArea rectanglearea=new RectangleArea(4,7);
		rectanglearea.calculationOfRectangleArea();

	    }

}
		


	      
	
		   

            