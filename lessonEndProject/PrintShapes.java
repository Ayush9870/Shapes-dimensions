package lessonEndProject;

import java.util.ArrayList;

public class PrintShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Shape> sh = new ArrayList<>();
		
		try {
		sh.add(new Rectangle(4,6));
		sh.add(new Square(3));
		
		for(Shape shape: sh)
		{
			shape.displayArea();
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("program executed Successfully");
		}
	}
}
