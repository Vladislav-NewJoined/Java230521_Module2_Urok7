import java.util.Scanner;

public class Task2_7_1 {

    public static void main(String[] args) {
        System.out.println("Задание : \n1.\tПользователь вводит пять строк. Выведите слово, состоящие из первой буквы каждой строки.\n\nРешение: ");
        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите пять строк/слов через пробел, например 'Иван идёт пить кофе': ");
        String line = scanner.nextLine();
        char[] chars = line.toCharArray();

        System.out.print(chars[0]);

        for (int i=1; i<chars.length; i++) {
            if (chars[i] == ' ') {
                System.out.print(chars[i+1]);
            }
        }
    }
}
