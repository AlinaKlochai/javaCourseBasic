package homeworks.homework_43.task_2;

import java.io.*;

public class CopyFileWithBuffer {
    public static void main(String[] args) throws IOException {
        String path = "src/homeworks/homework_43/task_2/FileForCoping";
        String path2 = "src/homeworks/homework_43/task_2/FileForWrite.txt";

        readAndWriteFileInAnotherFileWithBuffer(path,path2);

    }
    public static void readAndWriteFileInAnotherFileWithBuffer(String pathFileForCoping, String pathFileForWrite) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFileForCoping));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathFileForWrite));

        String line;

        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        bufferedReader.close();

    }
}
