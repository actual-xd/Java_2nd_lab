public class Task_10 {
    public static void main(String[] args) {
        int[] array;
        array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(array[i] + " ");
        }
        
    }
}
