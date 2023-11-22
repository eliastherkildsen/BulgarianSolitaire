import java.util.ArrayList;
import java.util.Arrays;

public class utill {

    public static void printDeck(ArrayList<Integer> deck){
        System.out.println();
        for (int value:deck) {
            System.out.printf("%s%d%s  ", color.ANSI_RED, value, color.ANSI_RESET);
        }

        System.out.println();
    }

    public static void crateNewStack(ArrayList<Integer> deck){

        int numberOfStacks = 0;

        // decrement all stacks in the deck by 1.
        for (int i = 0; i < deck.size(); i++) {
            int stackValue = deck.get(i);
            deck.set(i, stackValue-1);
            numberOfStacks++;

            // delete the stack if the value is 0.
            if (deck.get(i) == 0){
                deck.remove(i);
                // decrements i to account for deck.size decrementing.
                i--;
            }

        }

        // create new stack with the value of the previous number of stacks.
        if (numberOfStacks > 0) {
            deck.add(numberOfStacks);
        }
    }

    public static boolean isDone(ArrayList<Integer> deck) {

        // look through the deck.
        if (deck.containsAll(Arrays.asList(1,2,3,4,5,6,7,8,9))){
            return true;
        }

        // default return.
        return false;
    }
}
