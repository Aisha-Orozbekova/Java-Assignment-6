import java.util.Scanner;
public class Task6 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String result = "";

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c < '0' || c > '9') {
                result += c;
            }
        }
        System.out.println(result);
        in.close();
    }
}
