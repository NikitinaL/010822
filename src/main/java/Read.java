import java.io.File;
import java.io.FileNotFoundException;
import java.text.Collator;
import java.util.*;

public class Read {

    public static void main(String[] args) throws FileNotFoundException {
        //Прочитать слова из файла
        String path = "\\Users\\User\\Desktop\\task5.txt";
        File file = new File("\\Users\\User\\Desktop\\task5.txt");
        //объявляем сканер
        Scanner read = new Scanner(file);
        String line = read.nextLine();//
        String words[] = line.split(" ");
        //System.out.println(Arrays.toString(words));//выводим массив
        TreeSet<String> set = new TreeSet<String>(Collator.getInstance());
        HashMap<String, Integer> map = new HashMap<>();
        //Сортировка
        //Посчитать сколько раз каждое слово встречается в файле
        for (int i = 0; i < words.length; i++) {
            set.add(words[i]);
            if (!map.containsKey(words[i])) {
                map.put(words[i], 1);
            } else {
                map.put(words[i], map.get(words[i]) + 1);
            }

        }
        System.out.println(map);
        System.out.println(set);

        //Найти слово с максимальным количеством повторений
        //Вывести на консоль это слово и сколько раз оно встречается в файле
        int maxValue = Integer.MIN_VALUE;
        for (int value : map.values()) {
            set.add(words[value]);
            if (value > maxValue) {
                maxValue = value;
                map.put(words[value], 1);
                map.get(words[value]);
                System.out.println(words[value] + maxValue);
            }
        }


    }

}