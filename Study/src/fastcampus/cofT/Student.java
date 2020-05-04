package fastcampus.cofT;

import java.util.ArrayList;

public class Student {
	String StudentName;
	String BookName;
	ArrayList<Book> BookList;
	
	public Student(String StudentName) {
		this.StudentName = StudentName;
		
		BookList = new ArrayList<Book>();
	}
	
	public void addBook(String title, int number) {
		
		Book book = new Book(BookName, number);
		for(int i =0; i<number; i++)
		{
		BookList.add(book);
		}
		
		
		
	}
	
	public void ShowInfo() {
		for(Book book : BookList) {
		System.out.println(StudentName + "학생이 읽은 책은 : "+ book.getName() + "입니다" );
				
		}
	}
	

}
