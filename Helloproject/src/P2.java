import java.util.Scanner;

class P2Time {
	private int hour;
	private int minute;
	private int second;
	
	//첫 번째 생성자
	public P2Time() {
		this(0, 0, 0);
	}
	public P2Time(int h, int m, int s) {
		setP2(h, m, s);
	}
	
	public void setP2(int h, int m, int s) {
		hour = ((h >= 0 && h < 24) ? h : 0);
		minute = ((m >= 0 && m < 60) ? m : 0);
		second = ((s >= 0 && s < 60) ? s : 0);
	}
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}
public class P2{
	public static void main(String args[]) {
		P2Time time = new P2Time();
		
		System.out.println("기본 생성자 호출 후 시간: ");
		System.out.println(time.toString());
		
		P2Time time2 = new P2Time(13, 27, 6);
		System.out.println("두번째 생성자 호출 후 시간: ");
		System.out.println(time2.toString());
		
		P2Time time3 = new P2Time(99, 66, 77);
		System.out.println("올바르지 않은 시간 설정 후 시간: ");
		System.out.println(time3.toString());
		
	}
	
}
	
	

