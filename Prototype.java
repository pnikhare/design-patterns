import java.util.HashMap;

interface Shape 
{
	//int color;
	void paint();
	Shape clone();
}

class Circle implements Shape
{	private String name = "Circle";
	
	@Override
	public Shape clone() {
		return new Circle();
	}
	
	@Override
	public void paint() {
	System.out.println("Paint "+ name);
	}
}

class Triangle implements Shape
{	private String name = "Triangle";

	@Override	
	public Shape clone() {
		return new Triangle();
	}

	@Override	
	public void paint() {
		System.out.println("Paint " + name);
	}
}

class Rectangle implements Shape
{	private String name = "Rectangle";
	
	@Override
	public Shape clone() {
		return new Rectangle();
	}
	
	@Override
	public void paint() {
		System.out.println("Paint " + name);
	}
}


class ShapeFactory
{
	private static final HashMap<String, Shape> shapes = new HashMap<>();
	
	static
	{
		shapes.put("circle", new Circle());
		shapes.put("triangle", new Triangle());
		shapes.put("rectangle", new Rectangle());	
	}
	
	public static Shape paintShape(String type){
		//System.out.println(shapes.get(type));
		return shapes.get(type).clone();	
	}
}

public class Prototype
{
	public static void main(String args[]) {
	
		ShapeFactory.paintShape("circle").paint();
		ShapeFactory.paintShape("rectangle").paint();
		ShapeFactory.paintShape("triangle").paint();
		ShapeFactory.paintShape("circle").paint();
		//s.paint();
	}

}


