
public class Copy {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		int[] brr = copyOf(arr);
		for(int x : brr)
			System.out.print(x + " ");
	}
	
	public static int[] copyOf(int[] arr) {
		int[] brr = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			brr[i] = arr[i];
		}
		return brr;
		
	}
	
}
