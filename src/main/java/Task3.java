import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 20) - 10);
            System.out.println(arr[i]);
        }
        int Max = 0;
        int Min = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[Max]) {
                Max = i;
            } else if (arr[i] < arr[Min]) {
                Min = i;
            }
        }
        System.out.println("Максимум: " + arr[Max] + "\nМинимум: " + arr[Min]);
    }
}

