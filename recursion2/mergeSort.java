public static void mergeSort(int[] input){
		mergeSort(input,0,input.length-1);
		
	}
  
  
    public static void mergeSort(int[] input,int start,int end) {
		if(start>=end) {
			return ;
		}
		int mid= (start + end)/2;
		mergeSort(input, start, mid);
		mergeSort(input,mid+1,end);
		merge(input,start,end);
	}
  
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private static void merge(int[] input, int start, int end) {
		
		int mid=(start + end)/2;
		int i=start,j=mid+1,k=0;
		int[] temp=new int[end-start+1];
		
		while(i<=mid && j <=end) {
			if(input[i] <= input[j]) {
				temp[k++]=input[i++];
			}
			else {
				temp[k++]=input[j++];
			}
		}
		
		while(i<=mid) {
			temp[k++]=input[i++];
		}
		while(j<=end) {
			temp[k++]=input[j++];
		}
		int x=0;
		for(int m=start;m<=end;m++) {
			input[m]=temp[x++];
		}
		
		
		
	}
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		int[] input = takeInput();
		solution.mergeSort(input);
		printArray(input);
	}
