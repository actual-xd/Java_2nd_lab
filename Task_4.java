import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(n + " Случайных чисел: ");

        for (int i = 0; i < n; i++)
            System.out.println(Math.random());


    }
}