import java.util.Scanner;
public class returnpermutation {
	
	public static String[] permutationOfString(String input){
		if(input.length()==0) {
			String[] ans= {""};
			return ans;
		}
		String[] smallAns= permutationOfString(input.substring(1));
		String[] ans= new String[smallAns.length * input.length()];
		int k=0;
		for(int i=0;i<smallAns.length;i++) {
			for(int j=0;j<input.length();j++) {
				ans[k++]=smallAns[i].substring(0,j) + input.charAt(0)+ smallAns[i].substring(j); 
			}
		}
		return ans;
		
	}
  
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String output[] = permutationOfString(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
	
}
