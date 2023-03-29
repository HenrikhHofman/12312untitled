import java.util.Random;

public class MyClass {
    public static int[] init(int capacity) {
        int[] array = new int[capacity];
        Random rand = new Random();
        for (int i = 0; i < capacity; i++) {
            array[i] = rand.nextInt(100);
        }
        return array;
    }

    public static void printUnpaired(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}
