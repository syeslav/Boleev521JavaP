import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static boolean hasAllUniqueChars(String str) {
        Set<Character> characters = new HashSet<>();
        for (char c : str.toCharArray()) {
            // Метод add возвращает false, если символ уже присутствует в множестве
            if (!characters.add(c)) {
                return false;
            }
        }
        return true;
    }
}