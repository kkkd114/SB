package fastcampus;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(25, 2, 2000);
		System.out.println(date1.isValid());
		MyDate date2 = new MyDate(2, 12, 2006);
		System.out.println(date2.isValid());

	}

}
