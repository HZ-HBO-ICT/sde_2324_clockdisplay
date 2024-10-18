public class Console {

    public static void println(String line) {
        System.out.println(line);
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
