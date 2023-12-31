package lessonEndProject;

public class Square extends Shape {
	
	int length;
	
	public Square(int length)
	{
		this.length = length;
		
	}
	
	public double calculateArea()
	{
		return length*length;
	}
	
	public void displayArea()
	{
		System.out.println("the area of square is:" + calculateArea());
		
	}
	
	

}
