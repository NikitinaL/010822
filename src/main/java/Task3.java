import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Integer [] arr = new Integer[20];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 20) - 10);
            System.out.println(arr[i]);
        }
        getMaxMin(arr);
    }

    private static void getMaxMin(Integer[] arr) {
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i] && arr[i - 1] >= 0) {
                maxIndex = i - 1;
            }
            if (arr[i - 1] > arr[i] && arr[i - 1] < 0) {
                minIndex = i - 1;
            }
        }

        int max = arr[maxIndex];
        int min = arr[minIndex];
        arr[maxIndex] = min;
        arr[minIndex] = max;
        System.out.println("Максимум: " + min + "\nМинимум: " + max);
    }
}




