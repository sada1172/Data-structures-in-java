iomport java.util.Scanner;
public class replacecharacters {

	public static String replaceCharacter(String input, char c1, char c2) {
        
        if(input.length()==0){
            return input;
        }
        String ans = "";
        
        if(input.charAt(0)!=c1){
            ans = ans + input.charAt(0);
        }
        else{
            ans = ans + c2;
        }
        
        String s = replaceCharacter(input.substring(1),c1,c2);
        return ans + s;
		

	}
  
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		char c1 = s.next().charAt(0);
		char c2 = s.next().charAt(0);
		System.out.println(replaceCharacter(input, c1, c2));
	}
}
