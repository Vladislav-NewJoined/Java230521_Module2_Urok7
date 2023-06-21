import java.util.Scanner;

public class Task2_7_8 {

    public static void main(String[] args) {
        System.out.println("Задание : \n8.\tПользователь вводит предложение. Замените в каждом слове этого предложения, последн** д** бук** на **\n\nРешение: ");
        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите предложение, например 'Коллега пьет кофе.': ");
        String line = scanner.nextLine();
        String [] words = new String[1000];
        int countOfWords = 0;

        int start = 0;
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (!(((ch >= 'а') && (ch <= 'я')) || ((ch >= 'А') && (ch <= 'Я')) || ch == '-')) {
                String word = line.substring(start, i); //
                words[countOfWords] = word;
                countOfWords++;
                start = i + 1;

            }
        }

        for (int i=0; i<countOfWords; i++) {
            String str = words[i];
            char[] chars = str.toCharArray();
            int size = chars.length;
            for (int n = 0; n<size - 2; n++) {
                System.out.print(chars[n]);
            }
            System.out.print("** ");
        }
    }
}