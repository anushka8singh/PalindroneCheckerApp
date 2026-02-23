import java.util.Scanner;
public class PalindromeCheckerApp {

        public static boolean isPalindrome(String s){
            int n= s.length();
            for(int i=0;i<n/2;i++){
                if(s.charAt(i)!=s.charAt(n-i-1)){
                    return false;
                }
        }
            return true;

    }
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string :");
            String s = sc.nextLine();
            if(isPalindrome(s)){
                System.out.println("Palindrome");
            }else{
                System.out.println("Not a Palindrome");
            }
            sc.close();
    }
}
