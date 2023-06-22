import java.util.Scanner;

public class Task2_7_2 {

    public static void main(String[] args) {
        System.out.println("Задание : \n4.\tПосчитайте количество нулей в числе\n\nРешение: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String num = scanner.nextLine();

        int counter = 0;
        String zero = "0";

        for (char c : num.toCharArray()) {
            if (zero.indexOf(c) != -1) {  // найден ноль
                counter++;
            }

        }
        System.out.println("Количество нулей: " + counter);

    }
}