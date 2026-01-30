import java.io.*;
import java.util.Random;

public class RandomWord {
    public String randomWord() throws IOException {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        String randomWord;

        BufferedReader br = new BufferedReader( new InputStreamReader(this.getClass().getResourceAsStream("word.txt")));


        String line;
        while ((line = br.readLine()) != null){
            sb.append(line).append("\n");
        }
        String[] word = sb.toString().split("\n");

        int randomMaxMeaning = random.nextInt(word.length);

        return randomWord = word[randomMaxMeaning];
    }
}