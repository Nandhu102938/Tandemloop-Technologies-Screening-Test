import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program4 {
    public static List<Integer> parseInputList(String s) {
        List<Integer> nums = new ArrayList<>();
        if (s == null || s.trim().isEmpty()) return nums;
        Pattern p = Pattern.compile("-?\\d+");
        Matcher m = p.matcher(s);
        while (m.find()) {
            nums.add(Integer.parseInt(m.group()));
        }
        return nums;
    }

    public static Map<Integer, Integer> countMultiples(List<Integer> nums) {
        Map<Integer, Integer> result = new LinkedHashMap<>();
        for (int d = 1; d <= 9; d++) {
            int cnt = 0;
            for (int n : nums) {
                if (d != 0 && n % d == 0) cnt++;
            }
            result.put(d, cnt);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter list of integers (e.g. 1,2,8,9,10) : ");
            String raw = sc.nextLine().trim();
            List<Integer> nums = parseInputList(raw);
            Map<Integer, Integer> res = countMultiples(nums);
            System.out.println(res);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
