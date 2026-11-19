import java.util.Scanner;
public class Task4 {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        String text = input.nextLine().trim();

        int count = 0;
        if (!text.isEmpty()) {
            String[] words = text.split(" +");
            count = words.length;
        }
        System.out.println("Words = " + count);
    }
}
