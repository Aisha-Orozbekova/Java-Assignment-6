import java.util.Scanner;
public class Task9 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String reverse = "";

        for(int i = s.length() - 1; i >=0 ;i--) {
            reverse = reverse + s.charAt(i);
        }
        if (s.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        in.close();
    }
}
