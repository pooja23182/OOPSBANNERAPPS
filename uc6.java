public class uc6 {

    public static void main(String[] args) {

        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        String[] banner = new String[7];

        // Use loop instead of hardcoded indexes
        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("  ", o[i], o[i], p[i], s[i]);
        }

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    public static String[] buildO() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    public static String[] buildP() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    public static String[] buildS() {
        return new String[]{
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
    }
}
