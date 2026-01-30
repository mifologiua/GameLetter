import java.util.ArrayList;

public class MaskWord {
    public ArrayList<Character> maskWord(String word){

        ArrayList<Character> maskWord = new ArrayList<>();

            for (int i = 0; i < word.length(); i++) {
                maskWord.add(i, '*');
            }
        return maskWord;
    }
}
