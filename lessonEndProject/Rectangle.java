package lessonEndProject;

public class Rectangle extends Shape{
	
	//public class Rectangle extends Shape {
	    private double length;
	    private double width;

	    public Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	        this.area = calculateArea();
	    }

	    private double calculateArea() {
	        return length * width;
	    }
	   
	}

