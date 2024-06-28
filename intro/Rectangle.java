package intro;

public class Rectangle implements Shape {
	private int length;
	private int width;
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	@Override
	public void draw() {
		System.out.println("Rectangle is drawn using " + length + width);
	}
}
