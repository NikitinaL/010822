package Task5;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        //Прочитать слова из файла
        String path = "\\Users\\User\\Desktop\\task5.txt";
        File file = new File("\\Users\\User\\Desktop\\task5.txt");
        //объявляем сканер, пока есть следующая строка выводим
        Scanner read = new Scanner(file);
        while (read.hasNextLine()) {
            System.out.println(read.nextLine());
        }
        //Посчитать сколько раз каждое слово встречается в файле
        String words[] = read.delimiter().split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i] == words[i++]) ;
            count++;
        }
        //Вывести статистику на консоль
        System.out.println(count);

        //Найти слово с максимальным количеством повторений

        //Отсортировать в алфавитном порядке.
        // ArrayList list = new ArrayList();
        // list.add(words);

        //  Collections.sort(list);
        //  System.out.println(String.format(String.valueOf(list)));
    }

    // {

}
//}


