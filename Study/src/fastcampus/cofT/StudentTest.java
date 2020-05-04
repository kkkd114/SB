package fastcampus.cofT;

public class StudentTest {
	/* Lee 학생이 읽은 책은 : 태백산맥1 태백산맥2 입니다
	  * Kim 학생이 읽은 책은 : 토지1 토지2 토지3 입니다 
	  * Cho 학생이 읽은 책은 : 해리포터1 해리포터2 해리포터3 해리포터4 해리포터5 해리포터6 입니다
	 */ 
	public static void main(String[] args) {
		Student studentLee = new Student("Lee");
		studentLee.addBook("태백산맥", 2);
		Student studentKim = new Student("Kim");
		studentKim.addBook("토지", 3);
		Student studentCho = new Student("Cho");
		studentCho.addBook("해리포터", 6);

	}

}
