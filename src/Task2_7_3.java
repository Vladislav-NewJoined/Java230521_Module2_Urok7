import java.util.Scanner;

public class Task2_7_3 {

    public static void main(String[] args) {
        System.out.println("Задание : \n3.\tНайдите первую гласную букву в слове\n\nРешение: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово на кириллице или на латинице: ");
        String word = scanner.nextLine();

        String vawel = "АУОЫИЭЯЮЁЕауоыиэяюёеAEIOUaeiou";
        int counter = 0;
        int i = 0;

        while (i < word.length() && counter == 0) {
            char ch = word.charAt(i);

            if (vawel.contains(String.valueOf(ch))) {
                System.out.println("Первая гласная: " + String.valueOf(ch));
                counter++;
            }
            i++;
        }
    }
}