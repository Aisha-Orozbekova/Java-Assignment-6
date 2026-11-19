import java.util.Scanner;
public class Task5 {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        String s = in.nextLine();
        char result = ' ';

        for(int i = 0; i < s.length(); i++) {
            int count = 0;
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                result = s.charAt(i);
                break;
            }
        }
        System.out.println(result);
        in.close();
    }
}
