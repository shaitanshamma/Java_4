package lesson_1;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        File dir = new File("D:\\Projects\\Java_4\\src\\main\\resources\\1");
        dir.mkdir();
        File file = new File("D:\\Projects\\Java_4\\src\\main\\resources\\ТЗ.txt");
        BufferedReader fl = new BufferedReader(new FileReader(file));
        String str;

        while ((str=fl.readLine())!=null)
        System.out.println(str);
        dir.delete();
        fl.close();
    }
}
