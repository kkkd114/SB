import java.util.Scanner;

public class Student {

	private static final String = null;
	private String name;
	private int age;
	private int Mw;
	private String Adress;
	private int date;
	
	public Student(String name, int Mw, int age, String subject, int date){
		this.name = name;
		this.Mw = Mw;
		this.age = age;
		this.Adress = Adress;
		this.date = date;
		if(Mw == 1) {
			System.out.println("남자");
		}
		else {
			System.out.println("여자");
		}
				
	}
	
	public Student() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public void print() {
		System.out.println("이름: " + name);
		System.out.println("성별(남자는 1, 여자는 2): " + Mw);
		System.out.println("과목 : " + Adress);
		System.out.println("남은 기간: " + date);

		
	}

	public int getMw() {
		return Mw;
	}

	public void setMw(int mw) {
		Mw = mw;
		String M;
		Scanner scan = new Scanner(System.in);
		String defalt = scan.nextLine();
		if(defalt == M) {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}
}
