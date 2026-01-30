import java.util.ArrayList;

public class NotRecurring {
    public boolean recurring (String inputLetter, ArrayList<Character> usedLetter){

        boolean ifRecurring = false;
        for (int i = 0; i < usedLetter.size(); i++) {
            if (inputLetter.charAt(0) == usedLetter.get(i)){
                ifRecurring = true;
            }
        }
        return ifRecurring;
    }
}
