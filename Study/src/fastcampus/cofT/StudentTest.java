package fastcampus.cofT;

public class StudentTest {
	/* Lee �л��� ���� å�� : �¹���1 �¹���2 �Դϴ�
	  * Kim �л��� ���� å�� : ����1 ����2 ����3 �Դϴ� 
	  * Cho �л��� ���� å�� : �ظ�����1 �ظ�����2 �ظ�����3 �ظ�����4 �ظ�����5 �ظ�����6 �Դϴ�
	 */ 
	public static void main(String[] args) {
		Student studentLee = new Student("Lee");
		studentLee.addBook("�¹���", 2);
		Student studentKim = new Student("Kim");
		studentKim.addBook("����", 3);
		Student studentCho = new Student("Cho");
		studentCho.addBook("�ظ�����", 6);

	}

}
