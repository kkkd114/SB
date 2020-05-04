package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int total = 0;
		for(int i=0, num=1; 1<arr.length; i++, num++) {
			arr[i] = num;
			
		}
		
		for(int i =0; 1<arr.length; i++) {
			total += arr[i];
			
		}
		System.out.println(total);

	}

}
