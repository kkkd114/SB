import java.util.Scanner;

public class StudentManager
{
	//����
	public static final int MAX_PEOPLE = 20;
	private Student[] studentArray; 
	private int currentNumber;
	
	
	
	//���� �ο�,�Ѱ�
	public StudentManager() {
		studentArray = new Student[MAX_PEOPLE];
		currentNumber = 0;
	}
	//���ο� �л� ����
	public StudentManager(int size) 
	{
		studentArray = new Student[size];
		currentNumber = 0;
	}
	
	
	public void addStudent()
	{
		if(studentArray.length == currentNumber) 
		{
			System.out.println("���̻� �Է��� �� �����ϴ�.");
			return;
		}
		
		System.out.println("�л��� ������ �Է��� �ּ���");
		
	    Student a = new Student();
	    Scanner scan = new Scanner(System.in);
	    System.out.print("�л��� �̸�: ");
	    String name = scan.next();
	    a.setName(name);
	    int number = scan.nextInt();
	    a.setAge(number);
	    
	    
	    String Mf = scan.nextLine();
	    
	    
	    
		
	}
	public void findAndPrint(String name) {
		//�Է� ���� name�� ��ġ�ϴ� �л��� �ִ��� ã��
		//���� ��ġ�ϴ� �л��� ������ �� �л��� ���� ���
		//������ ��ġ�ϴ� ��� ���ٰ� ���
	}
	
	public void printAll()
	{
		//���� ��ϵǾ� �ִ� �л����� ������� ���
	
	}
	
}