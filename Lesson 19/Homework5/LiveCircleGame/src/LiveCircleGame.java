import java.util.LinkedList;
import java.util.Scanner;

public class LiveCircleGame {
    public static void main(String[] args) {
        LinkedList<String> players = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Заполнение списка участников
        System.out.println("Введите имена участников игры (для завершения введите \"конец\"):");
        String name;
        while (true) {
            name = scanner.nextLine();
            if (name.equalsIgnoreCase("конец")) {
                break;
            }
            if (!name.trim().isEmpty()) {
                players.add(name.trim());
            }
        }

        if (players.size() < 2) {
            System.out.println("Для игры необходимо как минимум два участника!");
            return;
        }

        // Игровой процесс
        System.out.println("Игра начинается!");
        String lastWord = "";
        while (players.size() > 1) {
            String currentPlayer = players.pollFirst();

            System.out.print(currentPlayer + ", назовите слово");
            if (lastWord.isEmpty()) {
                System.out.println(":");
            } else {
                System.out.println(", начинающееся с буквы '" + lastWord.charAt(lastWord.length() - 1) + "':");
            }

            String inputWord = scanner.nextLine().trim().toLowerCase();

            if (inputWord.isEmpty()) {
                System.out.println(currentPlayer + " выбывает из-за пустого слова!");
                continue;
            }

            boolean isValid = lastWord.isEmpty() ||
                    inputWord.charAt(0) == lastWord.charAt(lastWord.length() - 1);

            if (isValid) {
                lastWord = inputWord;
                players.addLast(currentPlayer);
                System.out.println("Принято! Теперь слово должно начинаться с буквы '"
                        + lastWord.charAt(lastWord.length() - 1) + "'");
            } else {
                System.out.println(currentPlayer + " выбывает из-за неправильного слова!");
            }
        }

        // Определение победителя
        if (players.size() == 1) {
            System.out.println("Поздравляем, " + players.getFirst() + " - победитель!");
        } else {
            System.out.println("Все игроки выбыли!");
        }
    }
}