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
		
		System.out.print("������ �Է��Ͻÿ�: ");
		salary = input.nextInt();
		
		deposit = 10 * 12 * salary;
		System.out.printf("10�� ������ �����: %d/n", deposit);
		
	}
}
// String[] a = new String[n]
// Scanner scan = new Scanner(Systme.in);
// a = scan.nextLine();
// for( int i = 0; i<n; i++--);
// ������ public name(){}
//name a = new name();
//