import java.util.Scanner;

public class PalindromeCheckerApp {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input=sc.nextLine();
        int length=input.length();
        boolean isPalindrome = true;
        for(int i=0;i<length/2;i++) {
            if (input.charAt(i) != input.charAt(length-i-1)) {
                isPalindrome=false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}