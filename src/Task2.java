import java.util.Scanner;
public class Task2 {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        String text = input.nextLine().toLowerCase();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch) && "aeiou".indexOf(ch) == -1) {
                count++;
            }
        }
        System.out.println("Consonants = " + count);
    }
}
