package baseline;

import java.util.Random;

public class Magic8Ball {
    private static final Random rand = new Random();
    private String[] answers = {"Yes", "No", "Maybe", "Ask again later."};

    public String getString(int i) {
        return answers[i];
    }

    public String getEightBallFortune() {
        //get a random number
        int index = rand.nextInt(4);
        //return the string from the corresponding list index
        return answers[index];
    }
}
