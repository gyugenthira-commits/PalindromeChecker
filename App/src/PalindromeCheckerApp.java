import java.util.Scanner;

public class PalindromeCheckerApp {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input=sc.nextLine();
        String rev="";
        for (int i=input.length()-1;i>=0;i--)
            rev+=input.charAt(i);
        System.out.println("The reversed string is: ");
        System.out.println(rev);
        if (input.equals(rev)) {
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
        sc.close();
    }
}