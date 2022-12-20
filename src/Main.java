import java.util.HashMap;
import java.util.Map;

import static java.lang.Character.toLowerCase;

public class Main {
    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();

        int value;
        final Integer ONE = 1;
        final String TEXT = "Lorem ipsum dolor sit amet, consectetur " +
                "adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna " +
                "aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris " +
                "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit" +
                " in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint" +
                " occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit " +
                "anim id est laborum.";

        for (int i = 0; i < TEXT.length(); i++) {
            Character cha = toLowerCase(TEXT.charAt(i));
            if (Character.isLetter(cha)) {
                if (map.containsKey(cha)) {
                    value = map.get(cha) + ONE;
                    map.put(cha, value);
                } else {
                    map.put(cha, ONE);
                }
            }
        }

        char maxChar = 'a';
        char minChar = maxChar;
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<Character, Integer> k : map.entrySet()) {
            int currentValue = k.getValue();
            char currentChar = k.getKey();
            if (currentValue > maxValue) {
                maxChar = currentChar;
                maxValue = currentValue;
            }

            if (currentValue < minValue) {
                minChar = currentChar;
                minValue = currentValue;
            }
        }

        System.out.println("Буква " + maxChar + " появлялась чаще всего, количество повторов: "
                + maxValue);
        System.out.println("Буква " + minChar + " появлялась реже всего, количество повторов: "
                + minValue);
    }
}
