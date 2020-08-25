import java.util.Scanner;
public class binarysearch {

	
	public static int binarySearch(int input[], int element) {
		return binarySearch(input,0,input.length-1,element);
	}
	public static int binarySearch(int arr[],int start,int end,int num) {
		
		if(start>end){
			return -1;
		}
		int mid=(start + end)/2;
		if(arr[mid]==num) {
			return mid;
		}
		else if(num < arr[mid]) {
			return binarySearch(arr, start, mid-1, num);
		}
		else {
			return binarySearch(arr, mid+1, end, num);
		}

	}
  
  public static int[] takeInput() {
    static Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
  
  public static void main(String[] args) {
		int[] input = takeInput();
		int element = s.nextInt();
		System.out.println(binarySearch(input, element));
	}

	
}
