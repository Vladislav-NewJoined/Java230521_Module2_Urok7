import java.util.Scanner;

public class Task2_7_5 {

    public static void main(String[] args) {
        System.out.println("Задание : \n5.\tВыведите слово наоборот, при этом столбиком\n\nРешение: ");
        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите слово: ");
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        for (int i=chars.length-1; i>=0; i--) {
            System.out.println(chars[i]);
        }
    }
}
