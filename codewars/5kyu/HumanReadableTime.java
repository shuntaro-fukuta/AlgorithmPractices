// https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        if (seconds < 0 || 359999 < seconds) {
            throw new RuntimeException("seconds must be between 0 and 359999.");
        }

        return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 3600) % 60, seconds % 60);
    }
}

