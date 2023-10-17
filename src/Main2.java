import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        int[] notes = {100, 50, 20, 10, 5, 2};
        int[] count = new int[notes.length];

        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                count[i] = amount / notes[i];
                amount %= notes[i];
            }
        }

        System.out.println("Notas:");
        for (int i = 0; i < notes.length; i++) {
            if (count[i] != 0) {
                System.out.println(notes[i] + " - " + count[i]);
            }
        }
    }
}