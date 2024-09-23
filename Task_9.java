public class Task_9 {
    public static void main(String[] args)
    {
        for (int i = -5; i <= 5; i++) {
            if (i == 0) continue;
            String str = "* ";
            String space = " ";
            System.out.println(space.repeat(5 - Math.abs(i)) + str.repeat(Math.abs(i)));
        }
    }
}
