import java.util.Scanner;
public class printallcodes {

	public static void printAllPossibleCodes(String input) {
		printAllCodes(input,"");

	}
    
    public static void printAllCodes(String str,String output) {


		if(str.length()==0) {
			System.out.println(output);
			return ;
		}
		char firstChar=(char)( (str.charAt(0)-'0' +'a' -1) );
		printAllCodes(str.substring(1), output + firstChar);
		if(str.length() >=2) {
			char firstTwoChar= (char)( (str.charAt(0) -'0')*10 +(str.charAt(1)-'0') + 'a' -1  );

			if(firstTwoChar >='a' && firstTwoChar <='z') {
				printAllCodes(str.substring(2), output + firstTwoChar);
			}

		}

	}
  
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		printAllPossibleCodes(input);
	}
}

