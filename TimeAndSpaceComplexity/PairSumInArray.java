import java.util.HashMap;
public class PairSum{	

	public static void pairSum(int[] arr, int num){
		HashMap<Integer, Integer> map=new  HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(map.containsKey(num-arr[i])) {
				for(int j=0;j< map.get(num-arr[i]);j++) {
					
					if(arr[i] < num-arr[i]) {
						System.out.println(arr[i] +" "+ (num-arr[i]));
					}else {
						System.out.println(num-arr[i] +" "+ arr[i]);
					}
					
					
				}
			}
			
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) +1);
			}else {
				map.put(arr[i],1);
			}
			
			
		}

	}
  
  public static void main(String[] args) {
		int[] arr = {1,8,7,5,4,6,-8,-1,7,-5};
		int num = 8;
		pairSum(arr, num);
	}
}
