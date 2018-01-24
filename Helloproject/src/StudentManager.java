import java.util.Scanner;

public class StudentManager
{
	//선언
	public static final int MAX_PEOPLE = 20;
	private Student[] studentArray; 
	private int currentNumber;
	
	
	
	//현재 인원,한계
	public StudentManager() {
		studentArray = new Student[MAX_PEOPLE];
		currentNumber = 0;
	}
	//새로운 학생 공간
	public StudentManager(int size) 
	{
		studentArray = new Student[size];
		currentNumber = 0;
	}
	
	
	public void addStudent()
	{
		if(studentArray.length == currentNumber) 
		{
			System.out.println("더이상 입력할 수 없습니다.");
			return;
		}
		
		System.out.println("학생의 정보를 입력해 주세요");
		
	    Student a = new Student();
	    Scanner scan = new Scanner(System.in);
	    System.out.print("학생의 이름: ");
	    String name = scan.next();
	    a.setName(name);
	    int number = scan.nextInt();
	    a.setAge(number);
	    
	    
	    String Mf = scan.nextLine();
	    
	    
	    
		
	}
	public void findAndPrint(String name) {
		//입력 받은 name과 일치하는 학생이 있는지 찾기
		//만약 일치하는 학생이 있으면 그 학생의 정보 출력
		//없으면 일치하는 사람 없다고 출력
	}
	
	public void printAll()
	{
		//현재 등록되어 있는 학생들의 모든정보 출력
	
	}
	
}