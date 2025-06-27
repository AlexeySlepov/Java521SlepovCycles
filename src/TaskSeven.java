import java.util.Scanner;

public class TaskSeven {
    //TODO: Напишите программу, которая проверяет, является ли число, введенное пользователем, простым
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result = "";
        int number = 0;
        boolean isSimple;
        // Цикл выполняется до тех пор, пока не будет введено целое число
        do {
            System.out.print("Введите целое число: ");
            result = scan.nextLine();
            try {
                number = Integer.parseInt(result);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не верные данные");
            }
        } while (true);

        isSimple = checkSimple(number);

        if (isSimple) {
            System.out.printf("Число %d - простое.", number);
        } else {
            System.out.printf("Число %d - не простое.", number);
        }
    }

    static boolean checkSimple(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
