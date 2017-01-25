import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Given a string, find its first non-repeating character.");
        System.out.println("Enter the word:");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                System.out.println("first non repeating char in a string   " + c);
                break;
            } else if (i == s.length() - 1) {
                System.out.println("no single char");
            }
        }
    }
}
