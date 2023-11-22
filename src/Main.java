import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static ArrayList<Integer> deck;

    public static void main(String[] args) {
        // setting up.
        deck = Setup.setup();
        utill.printDeck(deck);
        int count = 0;

        // main loop
        while (count < 1000){
            if (utill.isDone(deck)){
                utill.printDeck(deck);
                break;
            }
            count++;
            utill.crateNewStack(deck);
        }

        System.out.printf("%s[DONE] total count: %d%s%n", color.ANSI_GREEN, count, color.ANSI_RESET);

    }


}
