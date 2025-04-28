import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> numMap = new HashMap<>();

        System.out.println("Введите числа через пробел:");
        String[] numsInput = scanner.nextLine().split(" ");
        int[] nums = new int[numsInput.length];

        for (int i = 0; i < numsInput.length; i++) {
            nums[i] = Integer.parseInt(numsInput[i]);
            numMap.put(nums[i], i); // Осторожно: дубликаты перезапишут индексы!
        }

        System.out.println("Введите target sum:");
        int targetSum = scanner.nextInt();

        // Поиск пары
        for (int i = 0; i < nums.length; i++) {
            int complement = targetSum - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                System.out.println("Индексы: [" + i + ", " + numMap.get(complement) + "]");
                return;
            }
        }

        System.out.println("Пара не найдена.");
        scanner.close();
    }
}