package homeworks.homework_43.task_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        String path = "src/homeworks/homework_43/task_1/FileForReading.txt";
        readFile(path);
    }

    public static void readFile(String path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        String line;

        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        bufferedReader.close();
    }


}
