package intro;

public class Circle implements Shape {
	private int radius;
	public Circle(int radius){
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println("Circle is darwn using " + radius);
	}
}
