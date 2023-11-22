import java.util.ArrayList;
import java.util.Random;

public class Setup {
    /***
     * setup method for Bulgarian solitaire game
     * @return arraylist of random size (2-7) consisting of random values, witch in total equals totalCards var.
     */
    public static ArrayList<Integer> setup(){

        // creates random obj.
        Random random = new Random();
        // creates arraylist.
        ArrayList<Integer> deck = new ArrayList<>();
        // sets total value og cards not in a stack.
        int totalCards = 45;

        // creating initial number of stacks in the deck.
        int numberOfStacksInDeck = random.nextInt(2,7);

        // initialise every stack with value 0, to be able to set value add index later.
        for (int i = 0; i < numberOfStacksInDeck; i++) {
            deck.add(0);
        }

        // checks if all cards have been assigned a stack.
        while (totalCards != 0){
            // picks a random index min 0, max number of stacks.
            int index = random.nextInt(0,numberOfStacksInDeck);
            // adds 1 to the deck
            deck.set(index, deck.get(index) + 1);
            // decrements total cards with 1.
            totalCards --;
        }

        // print information relating to the setup.
        System.out.printf("%sall cards are used.%s%n", color.ANSI_YELLOW, color.ANSI_RESET);
        System.out.printf("%sthe size of the deck is: %d%s%n", color.ANSI_YELLOW, deck.size(), color.ANSI_RESET);

        // returns a deck(arraylist) consisting of all the stacks(int).
        return deck;

    }

}
