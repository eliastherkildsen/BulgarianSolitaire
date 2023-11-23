import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // setting up.
        ArrayList<Integer> deck = Setup.setup();
        utill.printDeck(deck);
        int count = 0;

        // main loop
        while (count < 1000){
            // checks if game is over.
            if (utill.isDone(deck)){

                // prints deck.
                utill.printDeck(deck);
                break;
            }
            // increments count
            count++;
            // creates new stack.
            utill.crateNewStack(deck);
        }

        // status messages when game over.
        System.out.printf("%s[DONE] total count: %d%s%n", color.ANSI_GREEN, count, color.ANSI_RESET);

    }


}
