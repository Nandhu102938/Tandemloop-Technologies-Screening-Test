import java.util.Scanner;

public class Program3 {
    public static String conditionalOdds(int a) {
        if (a <= 0) return "";
        int k = (a % 2 == 1) ? a : (a - 1);
        if (k < 1) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            int val = 2 * i + 1;
            if (i > 0) sb.append(", ");
            sb.append(val);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a (integer): ");
            int n = Integer.parseInt(sc.nextLine().trim());
            System.out.println(conditionalOdds(n));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
