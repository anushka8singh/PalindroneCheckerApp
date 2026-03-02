import java.util.*;

interface PalindromeStrategy {
    boolean isPalindrome(String text);
}

class StackStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String text) {
        Stack<Character> stack = new Stack<>();
        for (char c : text.toCharArray()) stack.push(c);
        for (char c : text.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String text) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : text.toCharArray()) deque.addLast(c);
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) return false;
        }
        return true;
    }
}

class TwoPointerStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String text) {
        int left = 0, right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left++) != text.charAt(right--)) return false;
        }
        return true;
    }
}

public class PerformanceComparison {
    public static void main(String[] args) {
        String testData = "racecar".repeat(1000);
        Map<String, PalindromeStrategy> strategies = new LinkedHashMap<>();
        strategies.put("Stack (Vector-based)", new StackStrategy());
        strategies.put("Deque (Array-based)", new DequeStrategy());
        strategies.put("Two-Pointer (Optimal)", new TwoPointerStrategy());

        System.out.printf("%-25s | %-15s%n", "Strategy", "Time (ns)");
        System.out.println("--------------------------------------------");

        for (var entry : strategies.entrySet()) {
            long start = System.nanoTime();
            entry.getValue().isPalindrome(testData);
            long end = System.nanoTime();
            System.out.printf("%-25s | %-15d%n", entry.getKey(), (end - start));
        }
    }
}