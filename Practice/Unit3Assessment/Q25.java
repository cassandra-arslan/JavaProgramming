package Unit3Assessment;
import java.util.Arrays;
import java.util.ArrayList;

public class Q25 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("during","storm", "rain", "fell", "season", "cloudy", "safe"));
        ArrayList<Integer> lengths = new ArrayList<>();

        for (String word: words){
            lengths.add(word.length());
        }
    }
}
