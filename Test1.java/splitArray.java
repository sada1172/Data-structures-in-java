import java.util.Scanner;
public class splitArray {

	public static boolean splitArray(int input[]) {
		
		return splitArray(input,0,input.length-1,0,0);
	}
    
    public static boolean splitArray(int[] arr,int start,int end,int lSum,int rSum) {
		
		if(start>end) {
			
			return lSum==rSum;
			
		}
		if(arr[start] % 5==0) {
			return splitArray(arr, start+1, end, lSum + arr[start], rSum);
		}
		else if(arr[start] %3==0) {
			return splitArray(arr, start+1, end, lSum, rSum+arr[start]);
		}
		else {
			return splitArray(arr, start+1, end, lSum+arr[start], rSum) || splitArray(arr, start+1, end, lSum, rSum+arr[start]);
		}
		
		
		
	}
  
  public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(splitArray(input));
	}
	

}
