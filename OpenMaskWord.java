import java.util.ArrayList;

public class OpenMaskWord {
    public ArrayList<Character> open(ArrayList<Character> maskWord, String word, String inputUser){
        ArrayList<Character> openMaskWord = maskWord;

        char[] wordChar = word.toCharArray();
        char letter = inputUser.charAt(0);

        for (int i = 0; i < openMaskWord.size(); i++) {
             if (letter == wordChar[i]){
                 openMaskWord.set(i, letter);
             }
        }
        return openMaskWord;
    }
}
