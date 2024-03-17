package homeworks.homework_43.task_2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileWithFileReaderAndFileWriter {

    public static void main(String[] args) throws IOException {
    String path = "src/homeworks/homework_43/task_2/FileForCoping";
    String path2 = "src/homeworks/homework_43/task_2/FileForWrite.txt";
    readAndCopyFileWithFileReaderAndFileWriter(path,path2);
    }

    public static void readAndCopyFileWithFileReaderAndFileWriter(String pathFileForCoping, String pathFileForWrite) throws IOException {
        FileReader reader = new FileReader(pathFileForCoping);
        FileWriter writer = new FileWriter(pathFileForWrite);
        int character;

        while ((character = reader.read()) != -1){
            System.out.println((char) character);
            writer.write(character);
        }

        reader.close();
        writer.close();

    }


}
