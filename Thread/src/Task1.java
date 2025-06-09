import java.io.File;
import java.util.Scanner;
import java.util.regex.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите путь к файлу: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        // Провкерка существования файла
        if (!file.exists() || !file.isFile()) {
            System.out.println("Ошибка: файл не существует!");
            return;
        }

        // 1. Подсчет слов (последовательностей букв)
        int wordCount = countWords(filePath);

        // 2. Подсчет букв
        int letterCount = countLetters(filePath);

        // 3. Подсчет целых чисел
        int numberCount = countNumbers(filePath);

        // 4. Подсчет гласных
        int vowelCount = countVowels(filePath);

        System.out.println("1. Количество слов: " + wordCount);
        System.out.println("2. Количество букв: " + letterCount);
        System.out.println("3. Количество чисел: " + numberCount);
        System.out.println("4. Количество гласных: " + vowelCount);
    }

    // 1. Подсчет слов
    private static int countWords(String text) {
        Pattern pattern = Pattern.compile("\\p{L}+");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    // 2. Подсчет букв
    private static int countLetters(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }

    // 3. Подсчет целых чисел
    private static int countNumbers(String text) {
        Pattern pattern = Pattern.compile("\\b\\d+\\b");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    // 4. Подсчет гласных
    private static int countVowels(String text) {
        String vowels = "AEIOUaeiouАЕЁИОУЫЭЮЯаеёиоуыэюя";
        int count = 0;
        for (char c : text.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}