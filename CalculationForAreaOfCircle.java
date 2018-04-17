import java.io.*;
/*public Interface Shapes
{
	public double areaOfCircle(CalculationForAreaOfShapes area);
	public double areaOfSquare(CalculationForAreaOfShapes area);
	public double areaOfTriangle(CalculationForAreaOfShapes area);
	
}*/

public class CalculationForAreaOfCircle implements DataInput
{
	public double length;
	public double radius;
	public double height;
	public double base;
	public double areaOfCircle;
	public double areaOfSquare;
	public double areaOfTriangle;
	
	public CalculationForAreaOfCircle( double length,double radius,double height,double base)
	{
		this.length=length;
		this.radius=radius;
		this.height=height;
		this.base=base;
	}
	/*public double areaOfCircle(CalculationForAreaOfShapes area)
	{	double pi = 3.14;
		areaOfCircle = pi*area.radius*area.radius;
		return areaOfCircle;
	}
	public double areaOfSquare(CalculationForAreaOfShapes area)
	{
		areaOfSquare = area.length*area.length;
		return areaOfSquare;
	}
	public double areaOfTriangle(CalculationForAreaOfShapes area)
	{
		areaOfTriangle = 0.5*area.base*area.height;
		return areaOfTriangle;
	}*/
	
	 public String readUTF() throws IOException { } 
	public String readLine() throws IOException { }
	

}
