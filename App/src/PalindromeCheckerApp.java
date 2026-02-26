public class PalindromeCheckerApp {
    static void main(String[] args) {
        String input="ashisihsa";
        char[] characters =input.toCharArray();
        int start=0;
        int end=characters.length - 1;
        boolean isPalindrome=true;
        while (start<end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Input text: "+input);
        System.out.println("Is it a palindrome? : "+isPalindrome);
    }
}