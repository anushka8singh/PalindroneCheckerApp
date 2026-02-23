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
            String s = "madam";
            if(isPalindrome(s)){
                System.out.println("Palindrome");
            }else{
                System.out.println("Not a Palindrome");
            }
    }
}
