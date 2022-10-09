package practice;
import java.util.Scanner;

public class ReverseStringWithScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I can reverse whatever you type in! Try me: ");
        String uInput1 = scan.nextLine();
        String reversed = "";

        //In the for loop, 'i' is set to the length of the user's input - 1 (since position begins with 0 and not 1)
        //'i' is greater than or equal to 0. Then deprecate (i--) 16 to capture the character at 15, and so on.
        for(int i = uInput1.length() - 1; i >= 0; i--){
            reversed = (reversed + uInput1.charAt(i));
        }
        System.out.println("Reversed input is: ");
        System.out.println(reversed);

        //Just for fun, see if the input is a palindrome (runs the same way forward and backwards
        boolean isPalindrome = (uInput1.equalsIgnoreCase(reversed));

        if(isPalindrome){
            System.out.println("Your input is a palindrome: it spells the same thing forward and backwards!");
        }else{
            System.out.println("Your input is not a palindrome. ");
        }
    }
}
