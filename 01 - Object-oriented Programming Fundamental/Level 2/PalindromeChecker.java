import java.util.Scanner;
class PalindromeChecker {
    String text;
    PalindromeChecker(String text) {
        this.text = text;
    }
    void checkPalindrome() {
        boolean result = true;
        char[] textArr = text.toCharArray();
        for (int i = 0; i < textArr.length / 2; i++) {
            if (textArr[i] != textArr[textArr.length - 1 - i]) {
                result = false;
                break;
            }
        }
        if (result) {
            System.out.println("The input text is a palindrome");
        } else {
            System.out.println("The input text is not a palindrome");
        }
    }
}
public class PalindromeCheckerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        PalindromeChecker palindromeChecker = new PalindromeChecker(text);
        palindromeChecker.checkPalindrome();
    }
}
