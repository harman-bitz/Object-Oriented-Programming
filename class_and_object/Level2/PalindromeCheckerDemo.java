class PalindromeChecker {
    String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        int left = 0;
        int right = text.length() - 1;
        
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }
}

// Main class to test the PalindromeChecker
public class PalindromeCheckerDemo {
    public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("madam");
        checker1.displayResult();
        
        PalindromeChecker checker2 = new PalindromeChecker("hello");
        checker2.displayResult();
    }
}
