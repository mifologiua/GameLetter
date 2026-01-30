import java.util.ArrayList;

public class RightLetterInput {
    public boolean isRightLetter(String word, String userUnput) {
        boolean isRight = false;
        char[] letterWord = word.toCharArray();
        ArrayList<Character> wordChar = new ArrayList<>();
        for (int i = 0; i < letterWord.length; i ++){
            wordChar.add(i, letterWord[i]);
        }
        for (int i = 0; i < letterWord.length; i++) {
            if (wordChar.get(i).equals(userUnput.charAt(0))){
                isRight = true;
            }
        }
        return isRight;
    }
}
