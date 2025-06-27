import java.util.Scanner;

// TODO: Напишите программу, которая проверяет, является ли введенное пользователем число четным или нечетным
public class TaskTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result = "";
        int number;
        // Цикл выполняется до тех пор, пока не будет введено целое число
        do {
            System.out.print("Введите целое число: ");
            result = scan.nextLine();
            try {
                number = Integer.parseInt(result);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не целое число");
            }
        } while (true);

        String chet = number % 2 == 0 ? "четное" : "нечетное";

        System.out.println("Число " + number + " - " + chet);
    }
}
