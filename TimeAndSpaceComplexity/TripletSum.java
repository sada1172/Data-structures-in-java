import java.util.Arrays;
import java.util.HashMap;
public class TripletSum {	

	public static void FindTriplet(int[] arr, int x){
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++) {
			
			int sum = x-arr[i];
			HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(map.containsKey(sum-arr[j])) {
					
					for(int k=0;k<map.get(sum-arr[j]);k++) {
						 System.out.println(arr[i] +" "+ (sum-arr[j])  +" "+arr[j]);
					}
					
					
				}
				
				if(map.containsKey(arr[j])) {
					map.put(arr[j],map.get(arr[j]) + 1);
				}else {
					map.put(arr[j],1);
				}
				
				
			}
			
			
			
			
		}
	}
}
