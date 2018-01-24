package shape;

public class Shapetest {
	public static void main(String[] args) {
		Rectangle Re1 = new Rectangle();
		Re1.draw();
		Re1.print();
		
		Circle Cir1 = new Circle();
		Cir1.draw();
		Cir1.print();
		
		Re1.move(1, 1);
		Cir1.move(5, 5);
		
		
	}

}
