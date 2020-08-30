public class FindUnique{	

	public static int findUnique(int[] arr){
		int unique=0;
		for(int i=0;i<arr.length;i++) {
			unique^=arr[i];
		}
		return unique;

	}
  
  public static void main(String[] args) {
		int[] arr = {1,5,2,1,8,7,5};
		System.out.print(findUnique(arr));
	}
}
