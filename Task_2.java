import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        if ((x < 1 && x > 0) && (y < 1 && y > 0)) System.out.print("true");
        else System.out.print("false");
    }
}