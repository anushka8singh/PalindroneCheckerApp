import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
public class PalindromeCheckerApp {


    public static void main(String[] args){

           
        /*Scanner sc = new Scanner(System.in);
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
        }*/
       /*  Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

       
        char[] arr = input.toCharArray();

        
        int left = 0;
        int right = arr.length - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (arr[left] != arr[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        
        if (isPalindrome) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }*/
       /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

       
        Stack<Character> stack = new Stack<>();

        
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        
        boolean isPalindrome = true;

        for (int i = 0; i < input.length(); i++) {
            char ch = stack.pop();   
            if (input.charAt(i) != ch) {
                isPalindrome = false;
                break;
            }
        }

        
        if (isPalindrome) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);   
            stack.push(ch); 
        }

       
        boolean isPalindrome = true;

        for (int i = 0; i < input.length(); i++) {
            char fromQueue = queue.remove(); 
            char fromStack = stack.pop();    
            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

      
        if (isPalindrome) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

            sc.close();
    }
}
