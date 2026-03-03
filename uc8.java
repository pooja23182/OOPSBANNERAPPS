import java.util.HashMap;

public class uc8{

    // Method to create and return character patterns
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        // Pattern for 'O'
        charMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        // Pattern for 'P'
        charMap.put('P', new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        });

        // Pattern for 'S'
        charMap.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        return charMap;
    }

    // Method to display banner
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        // Assuming all characters have same height
        int patternHeight = charMap.get(message.charAt(0)).length;

        // Loop through each row
        for (int line = 0; line < patternHeight; line++) {

            StringBuilder sb = new StringBuilder();

            // Loop through each character in message
            for (char ch : message.toCharArray()) {

                String[] pattern = charMap.get(ch);
                sb.append(pattern[line]).append("  "); // space between letters
            }

            System.out.println(sb.toString());
        }
    }

    // Main method
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}
    

