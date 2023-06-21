import java.util.Scanner;

public class Task2_7_4 {

    public static void main(String[] args) {
        System.out.println("Задание : \n4.\tПосчитайте количество согласных букв в слове\n\nРешение: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово на кириллице: ");
        String word = scanner.nextLine();

        String consonants = "БВГДЖЗЙКЛМНПРСТФХЦЧШЩбвгджзйклмнпрстфхцчшщ";

        int cons = 0;

        for (char c : word.toCharArray()) {
            if (consonants.indexOf(c) != -1) {  // найдена гласная
                cons++;
            }
        }
        System.out.println("Гласных: " + cons);

    }
}