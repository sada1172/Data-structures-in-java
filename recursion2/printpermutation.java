import java.util.Scanner;
public class printpermutation {

	public static void permutations(String input){
		printPermutations(input,"");

	}
    public static void printPermutations(String str,String output) {
		
		if(str.length()==0) {
			System.out.println(output);
			return ;
		}
		
		for(int i=0;i<str.length();i++) {
			printPermutations(  str.substring(0 , i) + str.substring(i+1) , output + str.charAt(i));
		}
    }
    
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		permutations(input);
	}
}
