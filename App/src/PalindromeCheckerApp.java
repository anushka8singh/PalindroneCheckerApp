import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

interface PalindromeStrategy {
    boolean isPalindrome(String text);
}

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String text) {
        String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : clean.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return clean.equals(reversed.toString());
    }
}

class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String text) {
        String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : clean.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}

class PalindromeChecker {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String text) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set");
        }
        return strategy.isPalindrome(text);
    }
}

public class Main {
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
        String input = "Racecar";

        checker.setStrategy(new StackStrategy());
        System.out.println("Stack Result: " + checker.check(input));

        checker.setStrategy(new DequeStrategy());
        System.out.println("Deque Result: " + checker.check(input));
    }
}