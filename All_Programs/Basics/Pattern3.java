public class Pattern3 {
    public static void main() {
        for (int i = 4; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (5 - i); k++) {
                System.out.print("* ");
            }
            System.out.println("");

        }
    }
}
