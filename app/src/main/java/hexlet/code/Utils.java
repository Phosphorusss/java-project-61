package hexlet.code;

public class Utils {
    public static int getRandomInt(int startingRangeValue, int endValueOfRange) {
        int randomNumber = startingRangeValue + (int) (Math.random() * endValueOfRange);
        return randomNumber;
    }
}
