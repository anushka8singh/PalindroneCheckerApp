import java.util.Scanner;
public class PalindromeCheckerApp {


    public static void main(String[] args){

           /*  Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string :");
            String s = sc.nextLine();
            String rev ="";
             for(int i=s.length()-1;i>=0;i--){
                 rev+=s.charAt(i);
             }
            if(s.equals(rev)){
                System.out.print("Palindrome");
            }else{
                System.out.println("Not a Palindrome");
            }*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        
        if (original.equals(reversed)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

            sc.close();
    }
}
