public class DuplicateInArray{	

	public static int duplicate(int[] arr){  
		int n=arr.length-2;
		int sum=0;
		for(int i : arr) {
			sum+=i;
		}
		return sum-(n*(n+1)/2);

	}
  
  public static void main(String[] args) {
		int[] arr = {5,4,8,9,5,7,8};
		System.out.print(duplicate(arr));
	}
}
