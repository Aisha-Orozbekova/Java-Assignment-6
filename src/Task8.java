import java.util.Scanner;
public class Task8 {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        String s = in.nextLine();
        String result = "";

        for(int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        System.out.println(result);
    }
}
