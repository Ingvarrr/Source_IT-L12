import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by vig on 12/14/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/vig/IdeaProjects/Source_IT-L12/Hometask 12/src/SomeFile.txt");
        if(file.createNewFile()){
            System.out.println("Файл создан");
        }else {
            System.out.println("Файл уже существует");
        }
        Path filePath = Paths.get("/home/vig/IdeaProjects/Source_IT-L12/Hometask 12/src/SomeFile.txt");

        byte[] fileInBytes = Files.readAllBytes(filePath);
        List<String> fileInStrings = Files.readAllLines(filePath);

        File file1 = new File("/home/vig/IdeaProjects/Source_IT-L12/Hometask 12/src/AnotherFile.txt");
        Path filePath2 = Paths.get("/home/vig/IdeaProjects/Source_IT-L12/Hometask 12/src/AnotherFile.txt");

        byte[] primitiveArray = {4,10,15,20,25};
        Files.write(filePath2, primitiveArray);

    }
}
