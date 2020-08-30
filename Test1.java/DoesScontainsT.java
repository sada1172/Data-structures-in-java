import java.util.Scanner;
public class doesScontainsT {
	public static boolean checkSequence(String a, String b) {
		if(a.length() < b.length()) {
			return false;
		}
		
		
		int j=0;
		
		for(int i=0;i<a.length();i++) {
			if( j<b.length() && a.charAt(i)==b.charAt(j)) {
				j++;
			}
		}
		if(j==b.length()) {
			return true;
		}
		
			return false;
		
		

	}
  
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String large = s.nextLine();
		String small = s.nextLine();

		System.out.println(checkSequence(large, small));
	}
}
