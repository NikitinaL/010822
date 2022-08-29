import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 20) - 10);

        }
        System.out.println(Arrays.toString(arr));
        int max = 0;
        int min = 0;
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < 20; i++) {
            if (arr[i] < 0 && (arr[i] > max || max == 0)) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] > 0 && (arr[i] < min || min == 0)) {
                min = arr[i];
                minIndex = i;
            }

        }
        arr[maxIndex] = min;
        arr[minIndex] = max;


        System.out.println(Arrays.toString(arr));
        System.out.println("Максимум: " + max + "\nМинимум: " + min);
    }

}





