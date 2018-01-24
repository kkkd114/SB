
public class Car {

	protected String color;
	public int speed;
	public int gear;
	
	public void speedUp(int increment) {
		speed += increment;
	}
	public void speedDown(int decremnet) {
		speed -= decremnet;
	}
	
	//»ı¼ºÀÚ
	public Car()
	{
		color = "red";
		speed = 1;
		gear = 1;
		System.out.println(color + " " + speed + "km" + " " + gear);
	}
	public Car(String col)
	{
		color = "col";
		speed = 10;
		gear = 5;
		System.out.println(col + " "  + speed + "km" + " "  + gear);
	}
	public Car(String col, int a)
	{
		color = "col";
		speed = a;
		gear = 7;
		System.out.println(col  + " " + a + "km" + " "  + gear);
	}
	public Car(String col, int a , int b)
	{
		color = "col";
		speed = a;
		gear = b;
		System.out.println(col + " "  + a + "km" + " "  + b);
	}
	
	
}
