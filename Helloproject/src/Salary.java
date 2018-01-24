import java.util.Scanner;

/**
 * 
 * @author user ex
 *
 */
public class Salary {

	public static void main(String args[]) {
		
		int salary;
		int deposit;
		Scanner input = new Scanner(System.in);
		
		System.out.print("월급을 입력하시오: ");
		salary = input.nextInt();
		
		deposit = 10 * 12 * salary;
		System.out.printf("10년 동안의 저축액: %d/n", deposit);
		
	}
}
// String[] a = new String[n]
// Scanner scan = new Scanner(Systme.in);
// a = scan.nextLine();
// for( int i = 0; i<n; i++--);
// 생성자 public name(){}
//name a = new name();
//