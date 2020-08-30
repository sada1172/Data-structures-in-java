public class checkRotation {

    public static int arrayRotateCheck(int[] arr){
    	int min=Integer.MAX_VALUE;
		int minIndex=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
				minIndex=i;
			}
		}
		return minIndex;
		
    }

}
