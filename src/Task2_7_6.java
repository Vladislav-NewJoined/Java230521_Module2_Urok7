import java.util.Scanner;

public class Task2_7_6 {

    public static void main(String[] args) {
        System.out.println("Задание : \n6.\tЗамените все гласные в слове на ‘у'\nРешение: ");
        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите слово на кириллице или на латинице: ");
        String str = scanner.nextLine();

        String str2 = str.replaceAll( "[АУОЫИЭЯЮЁЕауоыиэяюёеAEIOUaeiou]", "у" );
        System.out.println(str2);
    }
}
