import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int xd = 2;
        while (true) {
            System.out.println(xd);
            xd *= 2;
            if (xd > m) break;
        }
    }
}
