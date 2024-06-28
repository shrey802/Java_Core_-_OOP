package intro;

public class Sqaure implements Shape {
	private int length;
	private int breadth;
	public Sqaure(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public void draw() {
		System.out.println("Shape is Sqaure and width and length " + length + breadth);
	}
}
