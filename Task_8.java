import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите положительное целое число");
        int n = scanner.nextInt();
        while (n <= 0) {
            System.out.println("Соблюдайте условия! Попробуйте еще раз: ");
            n = scanner.nextInt();
        }
        String s = "" + n;
        System.out.println(s);
        if (s instanceof String) System.out.println(true);

    }
}
