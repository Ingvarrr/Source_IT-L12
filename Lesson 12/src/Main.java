/**
 * Created by vig on 11/11/16.
 */
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World");
        File main = new File("Lesson 12/src/Main.java");
        System.out.println("Exists : " + main.exists());
        System.out.println("Dir " + main.isDirectory());
        System.out.println("File " + main.isFile());
        System.out.println(main.isAbsolute());
        File f1 = main.getAbsoluteFile();
        File f2 = main.getCanonicalFile(); //using IOexeption
        main.getName();
        main.renameTo(new File ("/Lesson 12/src/")) //переименование, перенос файла


        System.out.println("Src");
        File src = new File("t.txt");
        System.out.println("Dir " + src.isDirectory());
        System.out.println("File " + src.isFile());
        System.out.println(src.isAbsolute());
        f1 = src.getAbsoluteFile();
        src.getFreeSpace(); // Возвращает количество свободного места, работает только для дисков
        src.getParentFile();
        src.list(); // еще можно добавить аргумент метод FileFilter, в котором переопределяется внутр анонимный класс
        src.getAbsoluteFile().getParentFile().mkdirs();
        System.out.println();

    }
}
