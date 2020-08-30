import java.util.Arrays;
import java.util.Scanner;
public class maxProfit {

	public static int maximumProfit(int budget[]) {
		
		Arrays.sort(budget);
		int[] profit=new int[budget.length];
		for(int i=0;i<budget.length;i++) {
			profit[i]=(budget.length-i)*budget[i];
		}
		int max=Integer.MIN_VALUE;
		for(int i : profit) {
			if(max < i) {
				max=i;
			}
		}
		return max;
		

	}
  
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i=0;i<n;i++){
			input[i] = s.nextInt();
        }
		
		System.out.println(maximumProfit(input));
	}

}
